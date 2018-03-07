package steps;

import io.appium.java_client.AppiumDriver;

public abstract class Base {
	protected AppiumDriver driver() {
    return iOSAndroidSetup.instance.driver;
    }
}
