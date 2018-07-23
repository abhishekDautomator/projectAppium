package firstAppiumProject;

import java.io.IOException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidUiAutomator3 extends FirstAppiumProgram1{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
		
		//Accessing elements using AndroidUIAutomator
		
		driver.findElementByAndroidUIAutomator("text(\"Preference\")").click();
		driver.findElementByAndroidUIAutomator("text(\"3. Preference dependencies\")").click();
		driver.findElementByAndroidUIAutomator("className(\"android.widget.CheckBox\")").click();
		driver.findElementByAndroidUIAutomator("text(\"WiFi settings\")").click();
		driver.findElementByAndroidUIAutomator("resourceId(\"android:id/edit\")").sendKeys("Abhi");
		driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
	}

}
