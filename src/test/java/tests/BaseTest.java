package tests;

import org.testng.annotations.BeforeMethod;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public abstract class BaseTest{
//    protected final MainPage mainPage = new MainPage();

    @BeforeMethod
    public void setup(){
        getBrowser().maximize();
        getBrowser().goTo

    }





}
