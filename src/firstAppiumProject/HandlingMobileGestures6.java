package firstAppiumProject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class HandlingMobileGestures6 extends FirstAppiumProgram1{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
		
		@SuppressWarnings("rawtypes")
		TouchAction t=new TouchAction(driver);
		
		//Swipe
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@content-desc='9']").click();
		
		PointOption<ElementOption> ele15=ElementOption.element(driver.findElementByXPath("//*[@content-desc='15']"));
		PointOption<ElementOption> ele45=ElementOption.element(driver.findElementByXPath("//*[@content-desc='45']"));
		
		t.longPress(ele15).moveTo(ele45).release().perform();
		
		//Scrolling
		//AndroidDriver<AndroidElement> driver2=capabilities();
		//driver2.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));").click();
	}

}
