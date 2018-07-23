package firstAppiumProject;

import java.io.IOException;

//import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class HandlingMobileGestures5 extends FirstAppiumProgram1 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=capabilities();
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//Verifying Tap options on android
		//TouchAction Tap=new TouchAction(driver);
		//AndroidElement not supported in current java appium client alternation is PointOption<ElementOption>
		//Tap.tap(driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")"));
		
		TouchAction t = new TouchAction(driver);
		PointOption<ElementOption> expandableList = ElementOption.element(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']"));
		t.tap(expandableList).perform();
		
		driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		
		PointOption<ElementOption> longpress=ElementOption.element(driver.findElementByAndroidUIAutomator("text(\"People Names\")"));
		t.longPress(longpress).release().perform();
		
		System.out.println(driver.findElementByAndroidUIAutomator("text(\"Sample action\")").getText());
	}

}
