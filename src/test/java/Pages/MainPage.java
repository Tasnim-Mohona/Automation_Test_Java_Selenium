package Pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.core.forms.Form;
import aquality.selenium.elements.interfaces.ILink;
import constants.LocatorConstants;
import constants.MainPageNavigation;
import org.openqa.selenium.By;

public class MainPage extends Form {

    public MainPage(){
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "Welcome to the-internet")),"Main Page");
    }

    private ILink getNavigationLink(MainPageNavigation navigation) {
        return AqualityServices.getElementFactory().getLink(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_PATH,
                navigation.getLabel())), navigation.getLabel());
    }
        public void clickNavigationLink(MainPageNavigation navigation){
        getNavigationLink(navigation).click();
    }
}
