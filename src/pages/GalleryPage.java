package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GalleryPage {
	
	WebDriver driver;
	WebDriver pageTitle;
	WebDriver logOutButton;
	
	public WebElement getPageTitle() {
		return driver.findElement(By.tagName("h1"));
	}
	public WebElement getLogOutButton() {
		return driver.findElement(By.linkText("Logout"));
	}
	
	

	// Constructor
	public GalleryPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	// Function
}
