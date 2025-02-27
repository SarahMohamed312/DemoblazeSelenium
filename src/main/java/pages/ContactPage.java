package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
    private WebDriver driver;

    //create constructor
    public ContactPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "recipient-email")
    private WebElement email;
    @FindBy(id = "recipient-name")
    private WebElement name;
    @FindBy(id = "message-text")
    private WebElement message;
    @FindBy(css = "button.btn.btn-primary")
    private WebElement btn;

    public void contactinfo(String email, String name,String message) {
        this.email.sendKeys(email);
        this.name.sendKeys(name);
        this.message.sendKeys(message);
        btn.click();
    }
}
