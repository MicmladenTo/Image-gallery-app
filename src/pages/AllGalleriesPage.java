package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllGalleriesPage {
	
	WebDriver driver;
	
	WebElement loginLink;
	WebElement createGallery;
	
	
	// Getters and setters
	public WebElement getLoginLink() {
		return driver.findElement(By.xpath("//a[@href='/login']"));
	}
	public WebElement getCreateGallery() {
		return driver.findElement(By.xpath("//a[@href='/create']"));
	}

	// Constructor
	public AllGalleriesPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	// Function
//	public void 
	
}
