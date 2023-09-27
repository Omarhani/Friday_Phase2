package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptAlertPage {

    WebDriver driver;
    public JavaScriptAlertPage(WebDriver driver) {
        this.driver =driver;
    }

    private By jsAlertButton = By.xpath("//button[contains(text(),'JS Alert')]");

    private By jsConfirmButton = By.xpath("//button[contains(text(),'JS Confirm')]");

    private By jsPromptButton =By.xpath("//button[contains(text(),'JS Prompt')]");


    public void clickOnJsAlertButton (){
        driver.findElement(jsAlertButton).click();
    }
    public void clickOnJsConfirmButton(){
        driver.findElement(jsConfirmButton).click();
    }
    public void clickOnPromptButton(){
        driver.findElement(jsPromptButton).click();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }
    public void insertAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }

}
