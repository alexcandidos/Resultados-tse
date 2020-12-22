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

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Selecione uma localidade acima\")")
    public MobileElement selectPlaceStr;

    public void selectPlace(){
        selectPlace.click();
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"100,00% das seções totalizadas\")")
    public MobileElement percentStr;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Eleito\")")
    public MobileElement electedStr;

    @AndroidFindBy(xpath = "//android.widget.ListView[1]//android.widget.Image")
    public MobileElement firstCandidateAvatar;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Favoritos\")")
    public MobileElement favoriteTab;

}
