package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyGalleriesPage {
	
	WebDriver driver;
	
	WebElement pageTitle;
	List<WebElement> galleryTitles;
	
	
	// Getters and setters
	public WebElement getPageTitle() {
		return driver.findElement(By.tagName("h1"));
	}
	public List<WebElement> getGalleryTitles() {
		return driver.findElements(By.xpath("//a[@class='box-title']"));
		
	}

	// Constructor
	public MyGalleriesPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
}
