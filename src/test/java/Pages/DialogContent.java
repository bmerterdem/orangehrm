package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DialogContent extends Parent {
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
    public DialogContent() {


        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[name='username']")
    public WebElement idBox;
    @FindBy(css = "[name='password']")
    public WebElement pass;
    @FindBy(css = "[type='submit']")
    public WebElement login;
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
    public WebElement add;
    @FindBy(css = "[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    public WebElement save;
    @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'][1])")
    public WebElement required;


    public WebElement getWebElement(String strButton) {

        switch (strButton) {
            case "idBox":
                return idBox;
            case "password":
                return pass;
            case "login":
                return login;
            case "add":
                return add;
            case "save":
                return save;
            case"required":
                return required;




        }

        return null;

    }
}