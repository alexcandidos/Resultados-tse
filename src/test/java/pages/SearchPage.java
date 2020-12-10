package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import manager.AppiumDriverManager;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

    private AppiumDriver<MobileElement> driver;
    private WebDriverWait wait;

    public SearchPage(AppiumDriver<MobileElement> appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        this.driver = appiumDriver;
        wait = AppiumDriverManager.getWait();
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").textContains(\"Todas\")")
    public MobileElement ufList;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").textContains(\"AL\")")
    public MobileElement state;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").textContains(\"OK\")")
    public MobileElement okBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").textContains(\"29/11/2020\")")
    public MobileElement turno2;





    public void selectUf(){
        ufList.click();
    }

    public void state(){

        //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().textContains(\"UF\").className(\"android.view.View\").scrollable(true)).scrollIntoView(new UiSelector().textContains(\"PE\"))"));
        //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().textContains(\"UF\").className(\"android.view.View\").scrollable(true)).flingToEnd(10)"));

        //driver.findElement(By.xpath("//android.widget.RadioButton[@text=\"PE\"]")).click();

        state.click();

        okBtn.click();

        turno2.click();
    }


}
