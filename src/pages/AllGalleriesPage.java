package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllGalleriesPage {
	
	WebDriver driver;
	
	WebElement loginLink;
	WebElement createGallery;
	WebElement myGalleries;
	WebElement searchInput;
	WebElement filterButton;
	
	
	// Getters and setters
	public WebElement getLoginLink() {
		return driver.findElement(By.xpath("//a[@href='/login']"));
	}
	public WebElement getCreateGallery() {
		return driver.findElement(By.xpath("//a[@href='/create']"));
	}
	public WebElement getMyGalleries() {
		return driver.findElement(By.xpath("//a[@href='/my-galleries']"));
	}
	public WebElement getSearchInput() {
		return driver.findElement(By.cssSelector("input[type='text']"));
	}
	public WebElement getFilterButton() {
		return driver.findElement(By.xpath("//button[contains(.,'Filter')]"));
	}
	

	// Constructor
	public AllGalleriesPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	// Function
//	public void 
	
}
