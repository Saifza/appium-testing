package myappiumtestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class AppiumTestNG {
	WebDriver  driver;
  @Test
  public void plusTesting() {
	  
	  WebElement six=driver.findElement(By.id("com.google.android.calculator:id/digit_6"));
	   six.click();
	   WebElement plus= driver.findElement(By.id("com.google.android.calculator:id/op_add"));
	   plus.click();
	   WebElement four=driver.findElement(By.id("com.google.android.calculator:id/digit_4"));
	   four.click();
	   WebElement equalsTo=driver.findElement(By.id("com.google.android.calculator:id/eq"));
	   equalsTo.click();
	  
	   WebElement clear= driver.findElement(By.id("com.google.android.calculator:id/clr"));
	   clear.click();
	  
  }
@Test
   public void multiplyTesting() {
	
	
	WebElement six=driver.findElement(By.id("com.google.android.calculator:id/digit_6"));
	   six.click();
	   WebElement mul= driver.findElement(By.id("com.google.android.calculator:id/op_mul"));
	   mul.click();
	   WebElement four=driver.findElement(By.id("com.google.android.calculator:id/digit_4"));
	   four.click();
	   WebElement equalsTo=driver.findElement(By.id("com.google.android.calculator:id/eq"));
	   equalsTo.click();
	  
	   WebElement clear= driver.findElement(By.id("com.google.android.calculator:id/clr"));
	   
	   
//	   String result= driver.findElement(By.id("com.google.android.calculator:id/result_preview")).getText();
//	  
//	   
//	   assertEquals("24","result");
	   clear.click();
	
	
}
	   
	   
	  
	  
  
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("appium:deviceName","Pixel_XL_API_30");
        cap.setCapability("platformName", "Android");
        cap.setCapability("appium:appPackage", "com.google.android.calculator");  
        cap.setCapability("appium:appActivity", "com.android.calculator2.Calculator");
        String url= "http://127.0.0.1:4723/wd/hub";
    	
        driver = new RemoteWebDriver(new URL(url), cap);
  
  }
  
  

  @AfterClass
  public void afterClass() {
	
  }

}
