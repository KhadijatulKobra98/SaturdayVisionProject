
package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePageLocators {
	//Search Button
	@FindBy(xpath="//input[@value='Search']")
	public WebElement btnSearch;
	
// search text box
	@FindBy(xpath="//input[@placeholder='Search for anything']")
	public WebElement txtbxsearch;
 // Mouse Hover to summary
	@FindBy(xpath="//a[@title= 'My eBay']")
	public WebElement linkmyebay ;
//
	@FindBy(xpath="//a[contains(text(),'Summary')]")
	public WebElement linkSummary ;
}
