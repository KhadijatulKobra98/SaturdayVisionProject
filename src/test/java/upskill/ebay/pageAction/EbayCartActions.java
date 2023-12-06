package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.EbayCartLocators;
import upskill.utilities.SetupDrivers;

public class EbayCartActions {

	
	EbayCartLocators EbayCartLocatorsobj;
	
	public EbayCartActions (){
		EbayCartLocatorsobj = new EbayCartLocators();
		PageFactory.initElements(SetupDrivers.driver,EbayCartLocatorsobj);
		
	}
	
	public void SwitchNewWindow(){
	for(String winhandle: SetupDrivers.driver.getWindowHandles() ){
		SetupDrivers.driver.switchTo().window(winhandle);
	}}
	
	public void ShirtSizeType(){
		Select dropDown = new Select(EbayCartLocatorsobj.ddsizetype);
		dropDown.selectByVisibleText("Big & Tall");
	}
	public void ShirtMenSize(){
		Select dropDown = new Select(EbayCartLocatorsobj.ddmensize);
		dropDown.selectByVisibleText("8XLT");
	}
	public void ShirtShades(){
		Select dropDown = new Select(EbayCartLocatorsobj.ddshades);
		dropDown.selectByVisibleText("White");
	}
	public void ShirtQuantity(){
		EbayCartLocatorsobj.txtbxquantity.clear();
		EbayCartLocatorsobj.txtbxquantity.sendKeys("5");
	}
	public void Addtocart(){
		EbayCartLocatorsobj.btnaddcart.click();
	}
}//this change for github 
