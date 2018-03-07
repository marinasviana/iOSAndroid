package steps;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class iOSAndroidSetup {
	
	public static OS executionOS = OS.ANDROID;

    public enum OS {
        ANDROID,
        IOS
    }
    public static iOSAndroidSetup instance = new iOSAndroidSetup();
    public AppiumDriver driver;

    public void start() throws MalformedURLException {
        if (driver != null) {
            return;
        }
        switch(executionOS){
            case ANDROID:
	            	File diretorioAplicacao = new File("/Users/m.siqueira.viana/Documents/TesteAppium/AppiumiOSAndroid/build/apk/");
	    			File arquivoAplicacao = new File(diretorioAplicacao, "app-android-calculator.apk");
	    			
	    			DesiredCapabilities capacidade = new DesiredCapabilities();
	    			capacidade.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	    			capacidade.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API 27");
	    			capacidade.setCapability(MobileCapabilityType.APP, arquivoAplicacao.getAbsolutePath());
	    			
	    			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidade);
                break;
            case IOS:
            		DesiredCapabilities caps = new DesiredCapabilities();
            		caps.setCapability("platformName", "iOS");
            		caps.setCapability("platformVersion", "11.2"); 
            		caps.setCapability("deviceName", "iPhone 7"); 
            		// caps.setCapability("bundleid", "com.example.apple-samplecode.UICatalog");
            		caps.setCapability("app", "/Users/m.siqueira.viana/Documents/TesteAppium/appiumiOSAndroid/build/ipa/SimpleCalculator.app"); 
            		driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
                break;
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

}
