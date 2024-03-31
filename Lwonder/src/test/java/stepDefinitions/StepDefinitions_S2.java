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

public class StepDefinitions_S2 {
	private WebDriver driver;
	private BaseClass baseClass = new BaseClass(driver);
	private HomePage homePage;
	private ProductPage productPage;
	private ProductToCart productToCart;
	private Waits wait = new Waits(driver);
	public static String Browser, URL = "https://www.amazon.in";

	@Given("Open {string} Browser and User is on the Amazon homepage")
	public void open_browser_and_user_is_on_the_amazon_homepage(String browser) throws Throwable {
		Browser = browser;
		baseClass.setUp(browser);
		homePage = new HomePage(driver);
	}

	@When("User searches for {string}")
	public void user_searches_for(String item) {
		homePage.getSearchBox().sendKeys(item);
		homePage.getSearchButton().click();
	}

	@When("User selects the second item from the list")
	public void user_selects_the_second_item_from_the_list() {
		productPage = new ProductPage(driver);
		productPage.clickSecondResult();

	}

	@When("User adds the item to the cart")
	public void user_adds_the_item_to_the_cart() {
		productToCart = new ProductToCart(driver);
		productToCart.clickAddToCart();
	}

	@When("User opens the cart")
	public void user_opens_the_cart() {
		productToCart.getAddToCartButton().click();
	}

	@Then("The price in the cart should match the price on the product page")
	public void the_price_in_the_cart_should_match_the_price_on_the_product_page() {
		productToCart = new ProductToCart(driver);
		String cartPrice = productToCart.getPrice().toString();
		String productPagePrice = productToCart.getSubTotal().toString();
		assertEquals(productPagePrice, cartPrice);
	}

	@Then("The subtotal in the cart should match the total price of the item added")
	public void the_subtotal_in_the_cart_should_match_the_total_price_of_the_item_added() {
		productToCart = new ProductToCart(driver);
		String subtotal = productToCart.getSubTotal().toString();
		String totalPrice = productToCart.getSubTotal().toString();
		assertEquals(totalPrice, subtotal);
	}
}
