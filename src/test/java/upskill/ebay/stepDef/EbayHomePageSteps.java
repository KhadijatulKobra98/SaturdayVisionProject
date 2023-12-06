package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomePageActions;
public class EbayHomePageSteps {
	EbayHomePageActions EbayHomePageActionsobj = new EbayHomePageActions();
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
	    
	}
	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
		EbayHomePageActionsobj.searchShoes();
	    
	}

   @Given("^Search for \"([^\"]*)\"$")
   public void search_for(String Items) throws Throwable {
	   EbayHomePageActionsobj.searchItems(Items);  
    
}
   @Given("^Search for Shirt$")
   public void search_for_Shirt() throws Throwable {
	   EbayHomePageActionsobj.searchCottonTee();
   }
   @When("^Mouse Hover to Ebay Summary$")
   public void mouse_Hover_to_Ebay_Summary() throws Throwable {
	   EbayHomePageActionsobj.MouseHoverMyEbay();
   }

   @Then("^Click on Summary$")
   public void click_on_Summary() throws Throwable {
	   EbayHomePageActionsobj.clickSummary();
   }

}
