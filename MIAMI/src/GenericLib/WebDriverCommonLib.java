package GenericLib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
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
	
	public void mouseOver(WebElement path) {
		
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
    
    public void Emailreports() throws EmailException
	{
    	DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    	LocalDateTime localDate = LocalDateTime.now();
    	String currentDate = dateFormat.format(localDate);
		EmailAttachment attachment=new EmailAttachment();
		attachment.setPath("C:\\Users\\PARDHASARADHI KALIKI\\git\\Miami\\MIAMI\\test-output\\emailable-report.html");
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription("Test Execution Report");
		attachment.setName(currentDate + " Report");
		
		//email message creation
		System.out.println("Sending email");
		//Email email = new SimpleEmail();
		MultiPartEmail email=new MultiPartEmail();
		System.out.println("working email");
		email.setHostName("smtp.bizmail.yahoo.com");
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator("pardhasaradhi.kaliki@ntc-in.com", "xgroqebqueizoafq"));
		email.setSSLOnConnect(true);
		email.setFrom("pardhasaradhi.kaliki@ntc-in.com");
		email.setSubject("Automation Test Execution Report");
		email.setMsg("Automation Test Execution Report");
		email.addTo("ntc.pardhu@gmail.com");
		email.attach(attachment);
		email.send();
		System.out.println("Email sent");
		
	}
    
    public void closeprintwindow() throws AWTException {
		
		 Robot r = new Robot();

		    r.keyPress(KeyEvent.VK_ESCAPE);
		    r.keyRelease(KeyEvent.VK_ESCAPE);
		    Reporter.log("Print window is closed", true);
	}
    
    public void SendEmail() {
    	
    	
    }

}
