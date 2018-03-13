package steps;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class iOSAndroidSetup {
	
    
	private static AppiumDriver<MobileElement> driver;

    public static AppiumDriver<MobileElement> start(String plataformName) throws MalformedURLException {
    	
    		DesiredCapabilities capacidade = new DesiredCapabilities();
    		
    		if (driver == null) {
    			if( plataformName.equals("Android")) {
    				capacidade.setCapability("platformName", "Android");
    				capacidade.setCapability("deviceName", "Nexus 5X API 27");
    		    	 	capacidade.setCapability("app", new File("apps/apk/app-android-calculator.apk"));
    		    	 	return driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capacidade);
    	         }else if(plataformName.equals("Ios")) {
    	            	 capacidade.setCapability("platformName", "iOS");
    		         capacidade.setCapability("platformVersion", "11.2"); 
    		         capacidade.setCapability("deviceName", "iPhone 7"); 
    		         capacidade.setCapability("app", new File("apps/ipa/SimpleCalculator.app")); 
    		         return driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capacidade);
    		     }else {
    		        	  Logger.getGlobal().info("========== Plataform name dont exist!! ==========");
    		     }
        }
			return driver;
    }
}
