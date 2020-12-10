package pages;

import manager.AppiumDriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InitialSetupPage {

    private AppiumDriver<MobileElement> driver;
    private WebDriverWait wait;

    public InitialSetupPage(AppiumDriver<MobileElement> appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        this.driver = appiumDriver;
        wait = AppiumDriverManager.getWait();
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Próximo\")")
    public MobileElement nextBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Entendi\")")
    public MobileElement understoodBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Li\")")
    public MobileElement readAndAcceptBtn;

    public void click(String option){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.Button")));

        if(option.equals("Próximo")){
            nextBtn.click();
        }else if(option.equals("Entendi")){
            understoodBtn.click();
        }else if(option.equals("Li e Aceito")){
            //readAndAcceptBtn.click();
            driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.Button\")")).click();
        }
    }

    public void scrollToEnd(){
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10)"));
    }
}

