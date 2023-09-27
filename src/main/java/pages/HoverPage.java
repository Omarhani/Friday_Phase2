package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utils.FigureCaption;

public class HoverPage {

    WebDriver driver;

    Actions actions;
    public HoverPage(WebDriver driver) {
        this.driver = driver;
    }
    private By figure = By.className("figure");

    private By figCaption = By.className("figcaption");

    public FigureCaption hoverOverFigure(int index){
        actions = new Actions(driver);
        actions.moveToElement(driver.findElements(figure).get(index-1)).build().perform();

        return new FigureCaption(driver.findElements(figCaption).get(index-1));

    }
}
