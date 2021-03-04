package tests;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.AllGalleriesPage;
import pages.LoginPage;





public class BaseTests {
	
	WebDriver driver;
	JavascriptExecutor js;
	ExcelReader excelReader;
	AllGalleriesPage allGalleriesPage;
	LoginPage loginPage;

	

	@BeforeClass
	public void preKlase() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
							"driver-lib\\chromedriver.exe");
		
		this.driver = new ChromeDriver();
		this.allGalleriesPage = new AllGalleriesPage(driver);
		this.loginPage = new LoginPage(driver, allGalleriesPage);
		this.excelReader = new ExcelReader("data/TCAndBugReports.xlsx");
//		this.logInTests = new LogInTests();
//		this.addressTests = new AddressTests();
//		this.addressPage = new AddressPage(js, driver);
//		this.myInformationPage = new MyInformationPage(js, driver);
//		this.myWishlistsPage = new MyWishlistsPage(driver);
		
		driver.manage().window().maximize();
	}
	

	
	@AfterClass
	public void afterClass() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		driver.close();
		System.out.println("Test suite completed.");
	}
	
}
