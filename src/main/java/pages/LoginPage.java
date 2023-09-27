package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.className("radius");

    public void insertUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void insertPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public SecureAreaPage clickOnLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }


}
