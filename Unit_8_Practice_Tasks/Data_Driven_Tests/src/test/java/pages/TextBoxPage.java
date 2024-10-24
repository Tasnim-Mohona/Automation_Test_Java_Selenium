package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import org.testng.Assert;

public class TextBoxPage extends Form {
    private final ITextBox userNameBox = getElementFactory().getTextBox(By.id("//input[@id='userName']"),"User Name Box");
    private final ITextBox emailBox = getElementFactory().getTextBox(By.id("//input[@id='userEmail']"),"Email Box");
    private final IButton submitBtn = getElementFactory().getButton(By.xpath("//button[@id='submit']"),"Sumbit Button");
    private final ITextBox outputBox = getElementFactory().getTextBox(By.id("//div[@id = 'output']"),"Output");

    public TextBoxPage(){
        super(By.id("//input[@id='userName']"),"User Name Box");
        }

    public void sendSearchKeys(String fullName, String email) {
        userNameBox.type(fullName);
        emailBox.type(email);
        clickSubmitBtn();
    }
    public void clickSubmitBtn() {
        submitBtn.click();
    }

    public void isValueDisplayed(String fullName, String email){
        Assert.assertEquals(outputBox.getText(), fullName, "Submitted full name does not match");
        Assert.assertEquals(outputBox.getText(), email, "Submitted email does not match");
    }
}
