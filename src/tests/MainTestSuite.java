package tests;



import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MainTestSuite extends BaseTests {
	
	@Test
	public void loggingIn() throws InterruptedException {
		String email = excelReader.getData("Test cases - content", 6, 4);
		String password = excelReader.getData("Test cases - content", 7, 4);
		
		driver.navigate().to("https://gallery-app.vivifyideas.com/");
		
		allGalleriesPage.getLoginLink().click();
		loginPage.logIn(email, password);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		assertEquals(allGalleriesPage.getCreateGallery().getText(), "Create Gallery");
	}
	
	@Test (priority = 2)
	public void createGallery() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		String galleryName = excelReader.getData("Test cases - content", 12, 4);
		String galleryDescription = excelReader.getData("Test cases - content", 22, 4);
		
		allGalleriesPage.getCreateGallery().click();
		wait.until(ExpectedConditions.visibilityOf(createGalleryPage.getPageTitle()));
		assertEquals(createGalleryPage.getPageTitle().getText(), "CREATE GALLERY");
		
		createGalleryPage.createAGallery(galleryName, galleryDescription);
		assertEquals(allGalleriesPage.getCreateGallery().getText(), "Create Gallery");
	}
	
	@Test (priority = 3)
	public void findUsersGallery() throws InterruptedException {
		Thread.sleep(3000);
		allGalleriesPage.getMyGalleries().click();

		Thread.sleep(3000);

		assertEquals(myGalleriesPage.getPageTitle().getText(), "MY GALLERIES");
		
		myGalleriesPage.getGalleryTitles().get(0).click();
		Thread.sleep(2000);
		
		String galleryName = excelReader.getData("Test cases - content", 12, 4).toUpperCase();
		String h1 = galleryPage.getPageTitle().getText();
		
		assertEquals(h1, galleryName);
	}
	
	@Test (priority = 4)
	public void logOut() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		galleryPage.getLogOutButton().click();
		
		wait.until(ExpectedConditions.visibilityOf(loginPage.getEmailInput()));
		assertEquals(loginPage.getPageTitle().getText(), "PLEASE LOGIN");
	}
	
	
	
}
