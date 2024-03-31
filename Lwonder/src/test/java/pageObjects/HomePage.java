package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//input[@id='twotabsearchtextbox']")
    private WebElement searchBox;

    public WebElement getSearchBox() {
        return searchBox;
    }

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchButton;

    public WebElement getSearchButton() {
        return searchButton;
    }

    @FindBy(xpath = ".//span[@id='nav-cart-count']")
    private WebElement cartIcon;

    public WebElement getCartIcon() {
        return cartIcon;
    }
}
