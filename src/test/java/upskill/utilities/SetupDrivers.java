package upskill.utilities;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;


public class SetupDrivers {

	

	public static WebDriver driver;             //initializing driver

	

	public static void setupDriver(){

		System.setProperty("webdriver.chrome.driver","C:\\Upskill\\chromedriver.exe"); 

								
//		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--start-maximized");

		options.addArguments("--disable-notifications");

		driver = new ChromeDriver(options);

		driver.get("https://www.ebay.com/");

	}

	

	public static WebDriver getDriver(){

		return driver;

	}


	

		public static void tearDownDriver(){
			driver.close();										//closing current driver
			driver.quit();										//closing all driver
		}}
