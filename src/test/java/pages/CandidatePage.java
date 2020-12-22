package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import manager.AppiumDriverManager;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CandidatePage {

    private AppiumDriver<MobileElement> driver;
    private WebDriverWait wait;

    public CandidatePage(AppiumDriver<MobileElement> appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        this.driver = appiumDriver;
        wait = AppiumDriverManager.getWait();
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Favoritar\")")
    public MobileElement addToFavorite;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Favorito\")")
    public MobileElement favorited;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Fechar\")")
    public MobileElement closeWindow;
}
