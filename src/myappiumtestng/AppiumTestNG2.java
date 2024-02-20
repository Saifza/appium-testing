package myappiumtestng;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class AppiumTestNG2 {
	WebDriver driver;
  @Test
  public void f() {
	  
	 WebElement searchBox= driver.findElement(By.id("com.android.quicksearchbox:id/search_src_text"));
	 searchBox.sendKeys("Appium Testing");
	 Actions action = new Actions(driver);
	 action.sendKeys(Keys.ENTER).perform();
	  
  }
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("appium:deviceName","Pixel_XL_API_30");
      cap.setCapability("platformName", "Android");
      cap.setCapability("appium:appPackage", "com.android.quicksearchbox");  
      cap.setCapability("appium:appActivity", "com.android.quicksearchbox.SearchActivity");
      String url= "http://127.0.0.1:4723/wd/hub";
  	
      driver = new RemoteWebDriver(new URL(url), cap);

}

  @AfterClass
  public void afterClass() {
	  
	  
  }

}
