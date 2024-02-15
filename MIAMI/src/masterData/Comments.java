package masterData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLib.BaseTest;

public class Comments extends BaseTest{
	
	@FindBy(xpath="/html/body/main/section/div[1]/div[2]/ul/li[1]/a")private WebElement masterData;
	@FindBy(xpath="//a[@href='/Addcomments/Addcomments/AddComments']")private WebElement commentPage; 
	@FindBy(xpath="//input[@id='Addcmnt']")private WebElement commentTextbox;
	@FindBy(xpath="//input[@value='Save']")private WebElement commentSave;
	
	public WebElement getMasterData() {
		return masterData;
	}
	public WebElement getCommentPage() {
		return commentPage;
	}
	public WebElement getCommentTextbox() {
		return commentTextbox;
	}
	public WebElement getCommentSave() {
		return commentSave;
	}
	public Comments()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void Commentadd() throws InterruptedException
	{
		Thread.sleep(2000);
		masterData.click();
		Thread.sleep(2000);
		commentPage.click();
		Thread.sleep(2000);
		commentTextbox.sendKeys("Cleaning Machine Problems");
		Thread.sleep(2000);
		commentSave.click();
	}
	
	
	
	
	
	
	

}
