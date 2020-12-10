package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import manager.AppiumDriverManager;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    private AppiumDriver<MobileElement> driver;
    private WebDriverWait wait;

    public MainPage(AppiumDriver<MobileElement> appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        this.driver = appiumDriver;
        wait = AppiumDriverManager.getWait();
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\")")
    public MobileElement selectPlace;

    public void selectPlace(){
        selectPlace.click();
    }

}
