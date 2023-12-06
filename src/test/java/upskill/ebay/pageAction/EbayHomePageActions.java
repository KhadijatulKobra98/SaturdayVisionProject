package upskill.ebay.pageAction;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.EbayHomePageLocators;
import upskill.utilities.SetupDrivers;

public class EbayHomePageActions{
	
	EbayHomePageLocators EbayHomePageLocatorsobj;
	
	
	public EbayHomePageActions(){
		
		EbayHomePageLocatorsobj= new EbayHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomePageLocatorsobj);
		
	}
	
	public void searchShoes(){
		EbayHomePageLocatorsobj.txtbxsearch.sendKeys("shoes");
		EbayHomePageLocatorsobj.btnSearch.click();
	}
	public void searchCottonTee(){
		EbayHomePageLocatorsobj.txtbxsearch.sendKeys("Big & Tall Cotton Tee");
		EbayHomePageLocatorsobj.btnSearch.click();}
	public void searchItems(String items){
		EbayHomePageLocatorsobj.txtbxsearch.sendKeys(items);
		EbayHomePageLocatorsobj.btnSearch.click();
	}
	public void MouseHoverMyEbay() throws Exception{
		Actions actions = new Actions (SetupDrivers.driver);
		actions.moveToElement(EbayHomePageLocatorsobj.linkmyebay);
		actions.perform();
		Thread.sleep(2000);
	}
	public void clickSummary() throws Exception{
		EbayHomePageLocatorsobj.linkSummary.isEnabled();
		EbayHomePageLocatorsobj.linkSummary.click();
		Thread.sleep(2000);
		
	}
}
