package firstAppiumProject;

import java.io.IOException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class HandlingMobileGestures7 extends FirstAppiumProgram1{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=capabilities();
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		
		@SuppressWarnings("rawtypes")
		TouchAction TA=new TouchAction(driver);
		
		PointOption<ElementOption> ele1=ElementOption.element(driver.findElementByXPath("(//*[@class='android.view.View'])[1]"));
		PointOption<ElementOption> ele2=ElementOption.element(driver.findElementByXPath("(//*[@class='android.view.View'])[3]"));
		
		TA.longPress(ele1).moveTo(ele2).release().perform();
		
	}

}
