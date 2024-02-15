package masterData;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import GenericLib.BaseTest;

public class Addforms {
	//----------------------------------------Add Forms-------------------------------------
	@FindBy(xpath="/html/body/main/section/div[1]/div[2]/ul/li[1]/a")private WebElement masterData; 
	@FindBy(xpath="//a[@href='/Forms/AddFormsMaster/GetFormsDetails']")private WebElement addForms; 
	@FindBy(xpath="//select[@id='indexlistitemsViewModel_getIndexlist_IndexID']")private WebElement selectIndex;
	@FindBy(xpath="//select[@id='indexlistitemsViewModel_getformsListModel_ID']")private WebElement publicArea;
	@FindBy(xpath="//select[@onchange='SubAreaChange()']")private WebElement subArea;
	@FindBy(xpath="//select[@id='QuestionId']")private WebElement factor;
	@FindBy(xpath="//select[@id='QCategoryId']")private WebElement category;
	@FindBy(xpath="//select[@id='TypeOfBox_Option']")private WebElement ratings;
	@FindBy(xpath="//input[@id='edit']")private WebElement formsSave;
	//----------------------------------------Managing roles----------------------
	@FindBy(xpath="//select[@id='ratingType']")private WebElement ratingField;
	@FindBy(xpath="//select[@id='operator']")private WebElement   ruleField;
	@FindBy(xpath="//select[@id='ratingVal2']")private WebElement ratingCout;
	@FindBy(xpath="//select[@id='QListId']")private WebElement factorField;
	@FindBy(xpath="//input[@name='SendNotification']")private WebElement sendNotification;
	@FindBy(xpath="//input[type='submit']")private WebElement saveRule;	
	
	
	public WebElement getSaveRule() {
		return saveRule;
	}
	public WebElement getRatingField() {
		return ratingField;
	}
	public WebElement getRuleField() {
		return ruleField;
	}
	public WebElement getRatingCout() {
		return ratingCout;
	}
	public WebElement getFactorField() {
		return factorField;
	}
	public WebElement getSendNotification() {
		return sendNotification;
	}
	public WebElement getFormsSave() {
		return formsSave;
	}
	public WebElement getMasterData() {
		return masterData;
	}
	public WebElement getAddForms() {
		return addForms;
	}
	public WebElement getSelectIndex() {
		return selectIndex;
	}
	public WebElement getPublicArea() {
		return publicArea;
	}
	public WebElement getSubArea() {
		return subArea;
	}
	public WebElement getFactor() {
		return factor;
	}
	public WebElement getCategory() {
		return category;
	}
	public WebElement getRatings() {
		return ratings;
	}
	public Addforms()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void FormsAdding() throws InterruptedException
	{
		masterData.click();
		Thread.sleep(1000);
		addForms.click();
		Thread.sleep(1000);
		Select sindex=new Select(selectIndex);
		sindex.selectByValue("2");
		Thread.sleep(1000);
		Select parea=new Select(publicArea);
		parea.selectByValue("3");
		Thread.sleep(4000);
		Select sarea=new Select(subArea);
		sarea.selectByValue("8"); 
		Thread.sleep(3000);
		Select factors=new Select(factor);
		factors.selectByValue("6");
		Thread.sleep(3000);
		Select categories=new Select(category);
		categories.selectByValue("1");
		Thread.sleep(3000);
		Select rats=new Select(ratings);
		rats.selectByValue("1");
		Thread.sleep(3000);
		formsSave.click();
		Thread.sleep(1000);
		BaseTest.driver.switchTo().alert().accept();
		Thread.sleep(2000);
		BaseTest.driver.switchTo().alert().accept();
		System.out.println("forms are saved");
		
		
	}
	
	public void Addmanaginrules() throws InterruptedException
	{
		Thread.sleep(2000);
		Select RF=new Select(ratingField);
		RF.selectByValue("2");
		Thread.sleep(2000);
		Select RuF=new Select(ruleField);
		RuF.selectByValue("2");
		Thread.sleep(2000);
		Select RFC=new Select(ratingCout);
		RFC.selectByValue("2");
		Thread.sleep(2000);
		Select Fac=new Select(factorField);
		Fac.selectByValue("38");
		Thread.sleep(2000);
		sendNotification.sendKeys("Rule is created");
		Thread.sleep(2000);
		saveRule.click();
		Thread.sleep(2000);
		System.out.println("Rule is saved");
	}
	

}
