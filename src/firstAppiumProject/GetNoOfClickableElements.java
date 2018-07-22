package firstAppiumProject;

import java.io.IOException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class GetNoOfClickableElements extends FirstAppiumProgram1 {
	
	public static void main(String[] main) throws IOException {
		
		AndroidDriver<AndroidElement> driver=capabilities();
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
		
	}

}
