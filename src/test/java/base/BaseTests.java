package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setUp(){
        // set up
        driver= new ChromeDriver();
        homePage = new HomePage(driver);

        goHome();

    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }


    @AfterClass
    public void tearDown(){
        // tear down
        driver.quit();
    }
}
