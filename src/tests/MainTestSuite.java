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
		
		createGalleryPage.createAGallery("Westie", "Nice westie pics");
		assertEquals(allGalleriesPage.getCreateGallery().getText(), "Create Gallery");
	}
	
	
	
}
