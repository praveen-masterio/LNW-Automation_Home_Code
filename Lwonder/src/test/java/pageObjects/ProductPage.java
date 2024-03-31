package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    private WebDriver driver;

    @FindBy(xpath = "(.//div[@class='sg-col-inner'])[6]")
    private WebElement firstResult;

    @FindBy(xpath = "(.//div[@class='sg-col-inner'])[7]")
    private WebElement secondResult;

    @FindBy(xpath = " (.//span[@class='a-price-whole'])[5]")
    private WebElement Productprice;
    
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickFirstResult() {
        firstResult.click();
    }

    public void clickSecondResult() {
        secondResult.click();
    }

	public WebElement getProductPrice() {
		
		return Productprice;
	}

	
}

