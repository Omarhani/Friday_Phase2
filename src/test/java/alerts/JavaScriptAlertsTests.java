package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.JavaScriptAlertPage;

public class JavaScriptAlertsTests extends BaseTests {

    @Test
    public void testJsAlert(){
        JavaScriptAlertPage javaScriptAlertPage = homePage.clickOnJavaScriptAlertLink();
        javaScriptAlertPage.clickOnJsAlertButton();
        javaScriptAlertPage.acceptAlert();
    }

    @Test
    public void testJsConfirm(){
        JavaScriptAlertPage javaScriptAlertPage = homePage.clickOnJavaScriptAlertLink();
        javaScriptAlertPage.clickOnJsConfirmButton();
        javaScriptAlertPage.dismissAlert();
    }
    @Test
    public void testJsPrompt(){
        JavaScriptAlertPage javaScriptAlertPage = homePage.clickOnJavaScriptAlertLink();
        javaScriptAlertPage.clickOnPromptButton();
        javaScriptAlertPage.insertAlert("Hello World!");
        javaScriptAlertPage.acceptAlert();
    }
}
