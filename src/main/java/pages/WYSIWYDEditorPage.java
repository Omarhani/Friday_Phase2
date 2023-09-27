package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYDEditorPage {

    WebDriver driver;
    public WYSIWYDEditorPage(WebDriver driver) {
        this.driver =driver;
    }
    private By editorField = By.id("tinymce");

    private By increaseIndent = By.cssSelector("[aria-label='Increase indent']");

    private String frameName = "mce_0_ifr";


    public void clearText(){
        switchToFrame();
        driver.findElement(editorField).clear();
        switchToParent();
    }
    public void insertInField(String text){
        switchToFrame();
        driver.findElement(editorField).sendKeys(text);
        switchToParent();
    }

    public void clickOnIncreaseIndent(){
        driver.findElement(increaseIndent).click();
    }

    private void switchToFrame(){
        driver.switchTo().frame(frameName);
    }
    private void switchToParent(){
        driver.switchTo().parentFrame();
    }
}
