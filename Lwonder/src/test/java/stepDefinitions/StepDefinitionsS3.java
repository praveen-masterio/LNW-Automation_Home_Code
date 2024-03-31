package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.ProductPage;
import pageObjects.ProductToCart;
import testBase.BaseClass;
import utils.Waits;

public class StepDefinitionsS3 {
	private WebDriver driver;
	private BaseClass baseClass;
	private HomePage homePage;
	private ProductPage productPage;
	private ProductToCart productToCart;
	private Waits wait;

	public static String Browser, URL = "https://www.amazon.in";

	@Given("Open {string} Browser and User is on the Amazon homepage")
	public void open_browser_and_user_is_on_the_amazon_homepage(String browser) throws Throwable {
		Browser = browser;
		baseClass = new BaseClass(driver);
		baseClass.setUp(browser);
		homePage = new HomePage(driver);
		wait = new Waits(driver);
	}

	@When("User types {string} in the Search field")
	public void user_types_in_the_search_field(String item) {
		homePage.getSearchBox().sendKeys(item);
	}

	@When("User presses {string}")
	public void user_presses(String key) {
		if (key.equalsIgnoreCase("Enter")) {
			homePage.getSearchButton().click();
		}
	}

	@When("User selects the first item from the list")
	public void user_selects_the_first_item_from_the_list() {
		productPage = new ProductPage(driver);
		productPage.clickFirstResult();
	}

	@When("User adds the item to the cart")
	public void user_adds_the_item_to_the_cart() {
		productToCart = new ProductToCart(driver);
		productToCart.clickAddToCart();
	}

	@When("User opens the cart")
	public void user_opens_the_cart() {
		productToCart = new ProductToCart(driver);
		productToCart.getPrice();
	}

	@Then("Each item's total price in the cart should match the price on the product page")
	public void each_item_total_price_in_the_cart_should_match_the_price_on_the_product_page() {
		productToCart = new ProductToCart(driver);
		String item1PriceOnCart = productToCart.getPriceOfItem(1);
		String item2PriceOnCart = productToCart.getPriceOfItem(2);
		String item1PriceOnProductPage = productPage.getProductPrice().getText().substring(1);
		String item2PriceOnProductPage = productPage.getProductPrice().getText().substring(1);
		assertEquals(item1PriceOnProductPage, item1PriceOnCart);
		assertEquals(item2PriceOnProductPage, item2PriceOnCart);
	}

	@Then("The subtotal in the cart should be the sum of the prices of the two items")
	public void the_subtotal_in_the_cart_should_be_the_sum_of_the_prices_of_the_two_items() {
		productToCart = new ProductToCart(driver);
		String subtotal = productToCart.getSubTotal().getText().substring(1);
		double expectedSubtotal = Double.parseDouble(productToCart.getPriceOfItem(1))
				+ Double.parseDouble(productToCart.getPriceOfItem(2));
		assertEquals(String.valueOf(expectedSubtotal), subtotal);
	}
}
