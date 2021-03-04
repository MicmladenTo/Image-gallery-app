package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
WebDriver driver;
AllGalleriesPage allGalleriesPage;
	
	WebElement emailInput;
	WebElement passwordInput;
	WebElement submitButton;
	
	
	// Getters and setters
	public WebElement getEmailInput() {
		return driver.findElement(By.id("email"));
	}
	public WebElement getPasswordInput() {
		return driver.findElement(By.id("password"));
	}
	public WebElement getSubmitButton() {
		return driver.findElement(By.cssSelector("button[type='submit']"));
	}

	// Constructor
	public LoginPage(WebDriver driver, AllGalleriesPage allGalleriesPage) {
		super();
		this.driver = driver;
		this.allGalleriesPage = allGalleriesPage;
	}
	
	// Function
	public void logIn(String email, String password) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(getEmailInput()));
		
		getEmailInput().sendKeys(email);
		getPasswordInput().sendKeys(password);
		getSubmitButton().click();
	}
}
