package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage {

    WebDriver driver;
    Actions actions;

    private final By srcBox = By.id("column-a");

    private By targBox = By.id("column-b");


    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
    }

    public void dragAndDrop(){
        actions = new Actions(driver);
        actions.moveToElement(driver.findElement(srcBox)).
                clickAndHold(driver.findElement(srcBox)).
                moveToElement(driver.findElement(targBox)).release().build().perform();
    }

    public void dragAndDrop2(){
        actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(srcBox), driver.findElement(targBox)).build().perform();
    }


}
