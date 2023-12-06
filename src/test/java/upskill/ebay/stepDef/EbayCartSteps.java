package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayCartActions;

public class EbayCartSteps {
	EbayCartActions EbayCartActionsobj = new EbayCartActions();

	@When("^Select Size$")
	public void select_Size() throws Throwable {
		EbayCartActionsobj.SwitchNewWindow();
		EbayCartActionsobj.ShirtSizeType() ;  
	}

	@When("^Select Men Size$")
	public void select_Men_Size() throws Throwable {
		EbayCartActionsobj.ShirtMenSize();  
	}

	@When("^Select Shade$")
	public void select_Shade() throws Throwable {
		EbayCartActionsobj.ShirtShades(); 
	}

	@When("^Select Quantity$")
	public void select_Quantity() throws Throwable {
		EbayCartActionsobj.ShirtQuantity();  
	}

	@Then("^Add to shopping cart$")
	public void add_to_shopping_cart() throws Throwable {
		EbayCartActionsobj.Addtocart(); 
	}

}
