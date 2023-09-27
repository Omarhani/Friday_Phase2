package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver =driver;
    }
    private By formAuthenticationLink = By.linkText("Form Authentication");

    private By dynamicLoadingLink = By.linkText("Dynamic Loading");


    private By javaScriptAlertLink = By.linkText("JavaScript Alerts");

    private By dragAndDropLink = By.linkText("Drag and Drop");
    private By dropDownLink = By.linkText("Dropdown");

    private By wysiwygEditorLink =By.linkText("WYSIWYG Editor");

    private By checkBox = By.xpath("Checkboxes");

    private By hoverLink  =By.linkText("Hovers");



    private void click(By locator){
       driver.findElement(locator).click();
    }

    public LoginPage clickOnFormAuthenticationLink(){
        click(formAuthenticationLink);
        return new LoginPage(driver);
    }

    public void clickOnCheckBox(){
        driver.findElement(checkBox).click();
    }

    public boolean isSelected(){
        return driver.findElement(checkBox).isSelected();
    }



    public DragAndDropPage clickOnDragAndDropLink(){
        click(dragAndDropLink);
        return new DragAndDropPage(driver);
    }


    public DynamicLoadingPage clickOnDynamicLoadingLink(){
        driver.findElement(dynamicLoadingLink).click();
        return new DynamicLoadingPage(driver);
    }

    public DropdownPage clickOnDropDownLink(){
        driver.findElement(dropDownLink).click();
        return new DropdownPage(driver);
    }




    public JavaScriptAlertPage clickOnJavaScriptAlertLink(){
        driver.findElement(javaScriptAlertLink).click();
        return new JavaScriptAlertPage(driver);
    }

    public WYSIWYDEditorPage clickOnWYSIWYGEditorLink(){
        driver.findElement(wysiwygEditorLink).click();
        return new WYSIWYDEditorPage(driver);
    }


    public HoverPage clickOnHoverLink(){
        clickOnElement(hoverLink);
        return new HoverPage(driver);
    }

    private void clickOnElement(By locator){
        driver.findElement(locator).click();
    }


}
