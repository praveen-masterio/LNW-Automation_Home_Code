package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductToCart {
	private WebDriver driver;

	@FindBy(xpath = ".//input[@id='add-to-cart-button']")
	private WebElement addToCartButton;

	@FindBy(xpath = ".//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")
	private WebElement price;

	@FindBy(xpath = "(.//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[1]")
	private WebElement subTotal;

	public ProductToCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickAddToCart() {
		addToCartButton.click();
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getSubTotal() {
		return subTotal;
	}

	public String getPriceOfItem(int index) {
		String priceXPath = "(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[position()="
				+ index + "]";

		WebElement itemPriceElement = driver.findElement(By.xpath(priceXPath));
		String itemPriceText = itemPriceElement.getText().trim();
		String priceValue = itemPriceText.replaceAll("[^\\d.]", "");
		return (priceValue);
	}
}
