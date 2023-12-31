package upskill.ebay.pageAction;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import upskill.ebay.pageElements.ShettyHomepageLocators;
import upskill.utilities.SetupDrivers;

public class ShettyHomepageActions {
	ShettyHomepageLocators ShettyHomepageLocatorsobj;
	
	public ShettyHomepageActions() {
		ShettyHomepageLocatorsobj = new ShettyHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, ShettyHomepageLocatorsobj);
	}

	public void loadShettyHomepage() throws Exception {
     SetupDrivers.driver.get("https://rahulshettyacademy.com/AutomationPractice/");
     Thread.sleep(3000);
	}

	public void clickIframeHome() {
		List<WebElement> framelist = SetupDrivers.driver.findElements(By.id("courses-iframe"));
		for (int i = 0; i < framelist.size(); i++) {
			SetupDrivers.driver.switchTo().frame(i);
			try {
				ShettyHomepageLocatorsobj.btnHome.click();
			} catch (Exception e) {
				System.out.println("Element not found in iframe");

			}
		}
	}

	public void verifyShettyHome() {

	}
}
