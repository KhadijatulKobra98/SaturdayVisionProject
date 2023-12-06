package upskill.ebay.pageAction;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {
	
	EbaySearchResultLocators  EbaySearchResultLocatorsobj;
	
	public EbaySearchResultActions(){
		
		 EbaySearchResultLocatorsobj= new EbaySearchResultLocators ();
		
	 PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsobj);
			}
	
	public void verifyshoesItems(){
		
		// option 1
		
		Assert.assertTrue(EbaySearchResultLocatorsobj.txtShoes.isDisplayed());
		//option 2
		
		Assert.assertEquals(EbaySearchResultLocatorsobj.txtShoes.getText(),"Shoes");
	}
  public void filterBrand(String brand){
	  if(brand.equals("Adidas")){
	  EbaySearchResultLocatorsobj.cbxBrandAdidas.click();}
	  else if (brand.equals("Nike")){
	  EbaySearchResultLocatorsobj.cbxBrandNike.click();}
	  else if (brand.equals("Unbranded")){
	  EbaySearchResultLocatorsobj.cbxBrandUnbranded.click();}
	  else{
		  System.out.println("Brand not found");
	  }
  }
  public void verifyBrandItems(String brand){
	  if(brand.equals("Adidas")){
	  Assert.assertTrue(EbaySearchResultLocatorsobj.txtShirts.isDisplayed());
	  } else if (brand.equals("Nike")){
	  Assert.assertTrue(EbaySearchResultLocatorsobj.txtShoes.isDisplayed());
	  }else  if(brand.equals("Unbranded")) 
		  {Assert.assertTrue(EbaySearchResultLocatorsobj.txtPants.isDisplayed());
  } else {
	  System.out.println("Brand not found");
	  
  }
} public void SelectCottonTee(){
	EbaySearchResultLocatorsobj.linkShirtItems.click();
}
}
