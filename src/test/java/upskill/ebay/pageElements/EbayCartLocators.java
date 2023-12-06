package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartLocators {
	
	// Shirt Size Type
	
		@FindBy(xpath="//select[@selectboxlabel='Size Type']")
		public WebElement ddsizetype;
	
	// Shirt men size
	
     	@FindBy(xpath="//select[@selectboxid='1001']")
		public WebElement ddmensize ;
	
	//Shirt Shades

		@FindBy(xpath="//select[@selectboxid='1002']")
		public WebElement ddshades ;
	// Shirt Quantity

		@FindBy(xpath="//input[@id='qtyTextBox']")
		public WebElement txtbxquantity ;
	// Add to cart

		@FindBy(xpath="//span[contains(text(),'Add to cart')]")
		public WebElement btnaddcart;
	

}
