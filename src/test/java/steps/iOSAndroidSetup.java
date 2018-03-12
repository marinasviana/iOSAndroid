package steps;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class iOSAndroidSetup {
	
	public static OS executionOS = OS.ANDROID;
	
    public enum OS {
        ANDROID,
        IOS
    }
    public static iOSAndroidSetup instance = new iOSAndroidSetup();
    public AppiumDriver driver;

    public void start(String plataformName) throws MalformedURLException {
    		//String PLATAFORM = System.getProperty("environment");
    		DesiredCapabilities capacidade = new DesiredCapabilities();
        
    		if (driver != null) {
            return;
        }
        

    		else if( plataformName.equals("Android")) {
	    			
			capacidade.setCapability("platformName", "androide");
			capacidade.setCapability("deviceName", "Nexus 5X API 27");
	    	 	capacidade.setCapability("app", new File("apps/apk/app-android-calculator.apk"));
	    	 	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidade);
                
         }else if(plataformName.equals("Ios")) {
            	 capacidade.setCapability("platformName", "iOS");
	         capacidade.setCapability("platformVersion", "11.2"); 
	         capacidade.setCapability("deviceName", "iPhone 7"); 
	         capacidade.setCapability("app", new File("apps/ipa/SimpleCalculator.app")); 
            		driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidade);
               
	     }else {
	        	  Logger.getGlobal().info("========== Plataform name dont exist!! ==========");
	     }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

}
