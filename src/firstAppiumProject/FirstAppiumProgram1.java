package firstAppiumProject;

import java.io.File;
import java.io.IOException;
//import java.net.MalformedURLException;
import java.net.URL;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.*;

public class FirstAppiumProgram1 {

	public static AndroidDriver<AndroidElement> capabilities() throws IOException {
		// TODO Auto-generated method stub
		
		File ApiDemos=new File("C:\\Users\\naray\\eclipse-workspace\\projectAppium\\src\\ApiDemos-debug.apk");
		//File ADapp=new File(ApiDemos,"ApiDemos-debug.apk");
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "NougatEmulator");
		dc.setCapability(MobileCapabilityType.APP,ApiDemos.getAbsolutePath());
		
		//work with server
		AndroidDriver<AndroidElement> AD=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		return AD;
	}

}
