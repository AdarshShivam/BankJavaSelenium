package com.inetBanking.testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class BaseClass {
	
	public String baseURL = "https://demo.guru99.com/v3/index.php";
	public String username = "mngr545715";
	public String password = "amumaqU";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		driver = new ChromeDriver(options);
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
