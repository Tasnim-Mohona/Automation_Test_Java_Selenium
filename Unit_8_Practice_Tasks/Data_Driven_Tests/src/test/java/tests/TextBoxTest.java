package tests;

import data.TestDataGenerator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.TextBoxPage;

//@Ignore -> before class means ignore class

public class TextBoxTest extends BaseTest {
  //  @Ignore  //ignore method
  // can either use name or
    @Test(dataProvider = "textBoxTest", dataProviderClass = TestDataGenerator.class)
    public void textBoxTest(String fullName, String email){
        TextBoxPage textBoxPage = new TextBoxPage();
        Assert.assertTrue(textBoxPage.state().isDisplayed(),"Page is not displayed");
        textBoxPage.sendSearchKeys(fullName, email);
        textBoxPage.clickSubmitBtn();
        textBoxPage.isValueDisplayed(fullName, email);
        System.out.println(fullName + email);
    }
}
