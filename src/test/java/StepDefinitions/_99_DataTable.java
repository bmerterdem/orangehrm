package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _99_DataTable extends Parent {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    @And("Click on the element in LefNav")
    public void clickOnTheElementInLefNav(DataTable items) {


        List<String> strButtons = items.asList(String.class);
        for (String strButton : strButtons) {
            WebElement element = ln.getWebElement(strButton); // webelemnti bul
            ln.clickFunction(element); // webelemente tıklat
        }
    }


    @And("Click on the element in DialogContent")
    public void clickOnTheElementInDialogContent(DataTable dt) {
        wait.until(ExpectedConditions.elementToBeSelected(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary']")));
        List<String>addbutton=dt.asList(String.class);
        for(String addbuttons:addbutton){
            WebElement element=dc.getWebElement(addbuttons);
            dc.clickFunction(element);
    }
}



    }







