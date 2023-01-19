package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderElements {

    public PlaceOrderElements(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//a[starts-with(@class,'c-hiring')]")
    public WebElement homepageVerify;

    @FindBy(xpath = "(//*[@class='icon u-block'])[1]")
    public WebElement blockIcon;

    @FindBy(css = "a[title='About Us']")
    public WebElement aboutUs;

    @FindBy(xpath = "//a[text()='Contact']")
    public WebElement contact;

    @FindBy(css = "[class='c-blockquote__content']")
    public WebElement bestPart;

    @FindBy(css = "[name='contact[name]']")
    public WebElement inputName;

    @FindBy(css = "[name='contact[company]']")
    public WebElement companyName;

    @FindBy(css = "[name='contact[email]']")
    public WebElement emailAdress;

    @FindBy(css = "[name='contact[phone]']")
    public WebElement contactNum;

    @FindBy(css = "[name='contact[message]']")
    public WebElement firstProject;

    @FindBy(xpath = "//span[text()='+90 232 463 15 55']")
    public WebElement phoneVerify;








}
