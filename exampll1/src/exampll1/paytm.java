package exampll1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class paytm {
	public class DifferentWebsites {
		public	 WebDriver driver = new FirefoxDriver();
		public String expectedTitle = null;
		public String actualTitle = null;

		@BeforeMethod      

		public void page() throws AWTException{
			Robot newtab = new Robot();
			newtab.keyPress(KeyEvent.VK_CONTROL);
			newtab.keyPress(KeyEvent.VK_T);
			newtab.keyRelease(KeyEvent.VK_CONTROL);
			newtab.keyRelease(KeyEvent.VK_T);
		}
	@Test(priority=0)
	
	public void Paytm() throws AWTException{

		driver.get("https://www.paytm.com");
		System.out.println("paytm is opened");
		driver.findElement(By.id("input_1")).sendKeys("sdn books");
		System.out.println("sdn books are displayed");
		Robot rr = new Robot();
		rr.keyPress(KeyEvent.VK_ENTER);
		rr.keyRelease(KeyEvent.VK_ENTER);

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("Z:\\scr\\paytm5.jpG"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	System.out.println("screen shots are taken");
		System.out.println("paytm test case is dine successfully");
	}
	}}
