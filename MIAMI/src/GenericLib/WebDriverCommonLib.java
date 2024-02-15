package GenericLib;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.io.Files;


public class WebDriverCommonLib {
	
	public String getPageTitle()
	{
		return BaseTest.driver.getTitle();
	}
	
	public void waitForTitle(String title)
	{
		WebDriverWait wait=new WebDriverWait(BaseTest.driver, Duration.ofSeconds(20) );
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	public void dummyText(String page) {
		
		Reporter.log("Execution done till " +page+", Waiting",true);
	}
	
	public void verify(String actual, String expected, String page)
	{
		Assert.assertEquals(actual, expected);
		Reporter.log(page+" is Displayed, PASS",true);
	}
	
    public void selectOption(WebElement element, int index) {
		
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
    public void selectOption(WebElement element, String value) {
		
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
    
    public void selectOption(String text ,WebElement element) {
		
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void fullPageScreenshot(String sspath)
	{
		TakesScreenshot ts = (TakesScreenshot)BaseTest.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(sspath);
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void scrollToElement(WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor)BaseTest.driver;
		 int x = element.getLocation().getX();
		 int y = element.getLocation().getY();
		 int yaxis = y+100;
		jse.executeScript("window.scrollBy("+x+","+yaxis+")");
	}
	
	public void mouseHover(WebElement path) {
		
		Actions ac = new Actions(BaseTest.driver);
		ac.moveToElement(path).perform();
		
	}
	
    public void doubleClick(WebElement path) {
		
		Actions ac = new Actions(BaseTest.driver);
		ac.doubleClick(path).perform();
	}	
	
    public void rightClick(WebElement path) {
		
		Actions ac = new Actions(BaseTest.driver);
		ac.contextClick(path).perform();
	}
	
    public void scrollDown() {    	
    	try {
			Robot r = new Robot();
			r.mouseWheel(30);
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
    	    	
    }
	
    public void scrollUp() {    	
    	try {
			Robot r = new Robot();
			r.mouseWheel(-30);
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
    }
    
//    public void fileUpload() 
//    {
//    	WebElement fileInput = BaseTest.driver.findElement(By.cssSelector("input[type=file]"));
//        fileInput.sendKeys(uploadFile.getAbsolutePath());
//        BaseTest.driver.findElement(By.id("file-submit")).click();
//    	
//    	
//    }

}
