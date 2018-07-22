package firstAppiumProject;

import java.io.IOException;

import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HandlingMobileGestures extends FirstAppiumProgram1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=capabilities();
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")");
		
		//Verifying Tap options on android
		
		TouchAction Tap=new TouchAction(driver);
		
		Tap.tap(driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")"));
	}

}
