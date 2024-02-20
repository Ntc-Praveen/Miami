package GenericLib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

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
	
	DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDateTime localDate = LocalDateTime.now();
	public String currentSysDate = dateFormat.format(localDate);
	
	SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date newDate = new Date();
	String sysTimeStamp = formatter.format(newDate);
	
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
    
    public void closeprintwindow() throws AWTException {
		
		 Robot r = new Robot();

		    r.keyPress(KeyEvent.VK_ESCAPE);
		    r.keyRelease(KeyEvent.VK_ESCAPE);
		    Reporter.log("Print window is closed", true);
	}
    
//    public void fileUpload() 
//    {
//    	WebElement fileInput = BaseTest.driver.findElement(By.cssSelector("input[type=file]"));
//        fileInput.sendKeys(uploadFile.getAbsolutePath());
//        BaseTest.driver.findElement(By.id("file-submit")).click();
//    	
//    	
//    }
    
    public void Emailreports() throws EmailException  {
    	
		EmailAttachment attachment=new EmailAttachment();
		attachment.setPath("C:\\Users\\PARDHASARADHI KALIKI\\git\\Miami\\MIAMI\\test-output\\emailable-report.html");
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription("Test Execution Report");
		attachment.setName(currentSysDate + " Report");
		
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
		Reporter.log("Email sent successfully", true);
		
	}
    
    public void SendEmail() {
        
    	// Sender's email credentials
        String senderEmail = "ntc.pardhu@gmail.com";
        String senderPassword = "cfoc tqhk mhfv vooz"; //cfoc tqhk mhfv vooz   
        
        // SMTP server configuration
        String smtpHost = "smtp.gmail.com";
        String smtpPort = "587"; // TLS Port
        
        // Email content
        String subject = "Test/Suite Execution Start Notification";
        String messageText = "Dear Team,\r\n"
        		+ "This email is to inform you that the Test/suite execution has been started.\r\n"
        		+ "\r\n"
        		+ "This is system generated email. Do not reply.\r\n"
        		+ "\r\n"
        		+ "Regards,\r\n"
        		+ "Team NTC QA";

        // List of recipient email addresses
        String[] recipients = {"pardhu161@gmail.com", "kaliki.pardhu@gmail.com", "pardhasaradhi.kaliki@ntc-in.com", "vidyasagar@ntc-in.com"};
        
        // Email sending properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", smtpHost);
        props.put("mail.smtp.port", smtpPort);

        // Authenticator to authenticate the sender's email credentials
        Authenticator authenticator = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        };

        // Create a session using the SMTP server properties and authenticator
        Session session = Session.getInstance(props, authenticator);
        
        try {
            // Create a MimeMessage object
            MimeMessage message = new MimeMessage(session);

            // Set the sender email address
            message.setFrom(new InternetAddress(senderEmail));

            // Set the subject
            message.setSubject(subject);

            // Set the email body
            message.setText(messageText);

            // Iterate through each recipient and add them to the message
            for (String recipient : recipients) {
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            }

            // Send the email
            Transport.send(message);

            System.out.println("Emails sent successfully to all recipients.");
            

        } catch (MessagingException e) {
            System.out.println("Failed to send emails. Error: " + e.getMessage());
        }
    }
    
    public void MailToManagerwithAttachment() {
    	
    	// Sender's email address
        String senderEmail = "ntc.pardhu@gmail.com";
        // Sender's password
        String senderPassword = "cfoc tqhk mhfv vooz";
        // Receiver's email address
        String receiverEmail = "pardhu161@gmail.com";
        // SMTP server address
        String smtpHost = "smtp.gmail.com";
        // SMTP server port
        String smtpPort = "587"; // Use 587 for TLS, 465 for SSL

        // Create properties object
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", smtpHost);
        properties.put("mail.smtp.port", smtpPort);

        // Create session object
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            // Create MimeMessage object
            Message message = new MimeMessage(session);
            // Set sender email address
            message.setFrom(new InternetAddress(senderEmail));
            // Set recipient email address
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiverEmail));
            // Set email subject
            message.setSubject("Email with Attachment");

            // Create MimeBodyPart object for the email body
            MimeBodyPart textPart = new MimeBodyPart();
            textPart.setText("Please find the attached file.");

            // Create MimeBodyPart object for the attachment
            MimeBodyPart attachmentPart = new MimeBodyPart();
            String filePath = "C:\\Users\\PARDHASARADHI KALIKI\\git\\Miami\\MIAMI\\test-output\\emailable-report.html"; // Path to the file to be attached
            attachmentPart.attachFile(filePath);

            // Create Multipart object to add both body and attachment
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(textPart);
            multipart.addBodyPart(attachmentPart);

            // Set the content of the email
            message.setContent(multipart);

            // Send the email
            Transport.send(message);

            System.out.println("Email sent successfully!");

        } catch (MessagingException | IOException e) {
            e.printStackTrace();
            System.out.println("Failed to send test report email. Error: " + e.getMessage());
        }
    	
    }
    
    public void MailToTeamWithAtachment() {
    	
    	// Sender's email address
        String senderEmail = "ntc.pardhu@gmail.com";
        String senderPassword = "cfoc tqhk mhfv vooz";
        // Receiver's email addresses (comma-separated)
        String receiverEmails = "pardhu161@gmail.com, kaliki.pardhu@gmail.com, pardhasaradhi.kaliki@ntc-in.com";
        // SMTP server address
        String smtpHost = "smtp.example.com";
        // SMTP server port
        String smtpPort = "587"; // Use 587 for TLS, 465 for SSL

        // Create properties object
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", smtpHost);
        properties.put("mail.smtp.port", smtpPort);

        // Create session object
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            // Create MimeMessage object
            Message message = new MimeMessage(session);
            // Set sender email address
            message.setFrom(new InternetAddress(senderEmail));
            // Set recipient email addresses
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiverEmails));
            // Set email subject
            message.setSubject("Email with Attachment");

            // Create MimeBodyPart object for the email body
            MimeBodyPart textPart = new MimeBodyPart();
            textPart.setText("Please find the attached file.");

            // Create MimeBodyPart object for the attachment
            MimeBodyPart attachmentPart = new MimeBodyPart();
            String filePath = "./test-output/emailable-report.html"; // Path to the file to be attached
            attachmentPart.attachFile(filePath);

            // Create Multipart object to add both body and attachment
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(textPart);
            multipart.addBodyPart(attachmentPart);

            // Set the content of the email
            message.setContent(multipart);

            // Send the email
            Transport.send(message);

            Reporter.log("Email sent successfully!", true);

        } catch (MessagingException | IOException e) {
            e.printStackTrace();
            Reporter.log("Failed to send mails", true);
           
        }
    	
    }

}
