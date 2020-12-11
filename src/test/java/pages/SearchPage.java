package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
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

    private final String turno1Str = "15/11/2020";
    private final String turno2Str = "29/11/2020";

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").textContains(\"Todas\")")
    public MobileElement ufList;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").textContains(\"AL\")")
    public MobileElement state;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").textContains(\"OK\")")
    public MobileElement okBtn;

    private String turnoSelectorRegex = "new UiSelector().className(\"android.widget.Button\").textContains(\"%s\")";

    private String stateSelectorRegex = "new UiSelector().className(\"android.widget.RadioButton\").textContains(\"%s\")";

    public void selectState(String option){

        String stateSelector = String.format(stateSelectorRegex, option);

        ufList.click();

        driver.findElement(new MobileBy.ByAndroidUIAutomator(stateSelector)).click();

        okBtn.click();
    }

    public void selectTurno(String option){
        String turnoSelector = "";

        if(option.equals("1")){
            turnoSelector = String.format(turnoSelectorRegex, turno1Str);
        }else if(option.equals("2")){
            turnoSelector = String.format(turnoSelectorRegex, turno2Str);
        }

        driver.findElement(new MobileBy.ByAndroidUIAutomator(turnoSelector)).click();

    }


}
