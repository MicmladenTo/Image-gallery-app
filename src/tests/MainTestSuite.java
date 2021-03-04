package tests;



import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

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
	
	
	
}
