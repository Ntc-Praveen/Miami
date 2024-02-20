package masterData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import GenericLib.BaseTest;

public class AddComments extends BaseTest{
	
	@FindBy(xpath="/html/body/main/section/div[1]/div[2]/ul/li[1]/a")private WebElement masterData;
	@FindBy(xpath="//a[@href='/Addingcomments/Addingcomments/AddComments']")private WebElement commentPage; 
	@FindBy(xpath="//input[@id='Addcmnt']")private WebElement commentTextbox;
	@FindBy(xpath="//input[@value='Save']")private WebElement commentSave;
	@FindBy(xpath="//input[@type='search']")private WebElement commentSearchBox;
	@FindBy(xpath="//img[@title='Delete Comment']")private WebElement commentDelete; 
	@FindBy(xpath="//div[@class='swal-button-container'][2]")private WebElement clickokButton;
	
	public WebElement getCommentDelete() {
		return commentDelete;
	}
	public WebElement getClickokButton() {
		return clickokButton;
	}
	public WebElement getMasterData() {
		return masterData;
	}
	public WebElement getCommentSearchBox() {
		return commentSearchBox;
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
	public AddComments()
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
		Thread.sleep(2000);
		Reporter.log("comment added successfully",true);
	}
	public void Deletecomment() throws InterruptedException
	{
		Thread.sleep(2000);
		masterData.click();
		Thread.sleep(2000);
		commentPage.click();
		Thread.sleep(2000);
		commentSearchBox.sendKeys("Cleaning Machine Problems");
		Thread.sleep(2000);
		commentDelete.click();
		Thread.sleep(2000);
		clickokButton.click();
		Reporter.log("comment deleted successfully",true);
	}
	
	
	
	
	
	

}
