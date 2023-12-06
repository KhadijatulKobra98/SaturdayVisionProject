package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	
	//validate shoes items
	@FindBy(xpath="//span[contains(text(),'Shoes')]")
     public WebElement txtShoes;
	
	//validate Shirts items
		@FindBy(xpath="//span[contains(text(),'Shirts')]")
	     public WebElement txtShirts;
		//validate Pants items
		@FindBy(xpath="//span[contains(text(),'Pants')]")
	     public WebElement txtPants;
	
	// Checkbox Brand Adidas
	
	@FindBy(xpath="//input[@aria-label='adidas']")
	public WebElement cbxBrandAdidas;
	
	// Checkbox Brand Nike
	
	@FindBy(xpath="//input[@aria-label='Nike']")
	public WebElement cbxBrandNike;
	
	// Checkbox Brand Unbranded
	
	@FindBy(xpath="//input[@aria-label='Unbranded']")
	public WebElement cbxBrandUnbranded;
	
	// shirtlink
	@FindBy(xpath= "//span[contains(text(),'Big & Tall Cotton Tee. Sizes 4 XLT to 8XLT. With & without pockets.')]")
	public WebElement linkShirtItems;
}
