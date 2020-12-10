package manager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriverManager {

    private static AppiumDriver<MobileElement> driver;

    private static WebDriverWait wait;
    private static final long defaultTimeout = 10;

    private static final String APK_PATH = "Users/alex/Documents/projects/personal/appium/java/Resultados/src/main/resources/apk/Resultados.apk";
    private static final String APPIUM_URL_SERVER = "http://localhost:4723/wd/hub";

    public static AppiumDriver<MobileElement> createDriver(){

        if (driver == null) {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2_API_28");
            desiredCapabilities.setCapability(MobileCapabilityType.VERSION, "9.0");
            desiredCapabilities.setCapability(MobileCapabilityType.APP, APK_PATH);
            desiredCapabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true");
            try {
                driver = new AndroidDriver<MobileElement>(new URL(APPIUM_URL_SERVER), desiredCapabilities);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return driver;
    }

    public static AppiumDriver<MobileElement> getDriver() {
        if(driver == null){
            return createDriver();
        }
        return driver;
    }

    public static void closeDriver(){
        driver.quit();
    }

    public static void relaunchApp(){
        driver.launchApp();
    }

    public static WebDriverWait getWait(long defaultTimeout) {
        if (wait == null) {
            wait = new WebDriverWait(driver, defaultTimeout);
        }
        return wait;
    }

    public static WebDriverWait getWait() {
        if (wait == null) {
            wait = new WebDriverWait(driver, defaultTimeout);
        }
        return wait;
    }
}
