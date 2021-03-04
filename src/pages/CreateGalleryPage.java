package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateGalleryPage {
	
	WebDriver driver;
	
	WebElement pageTitle;
	WebElement galleryTitle;
	WebElement galleryDescription;
	List<WebElement> imgUrlInput;
	WebElement addImage;
	WebElement submitButton;
	
	private String img1 = "https://cdn.orvis.com/images/DBS_Westie_1280.jpg";
	private String img2 = "https://i.pinimg.com/originals/00/5c/6a/005c6a58ee2b42467d9f254dbb28328e.jpg";
	private String img3 = "https://i.pinimg.com/originals/a8/ff/dc/a8ffdc572e3fd2e7eab08a407f77ff62.jpg";
	
	
	// Getters and setters
	public WebElement getPageTitle() {
		return driver.findElement(By.xpath("//h1[contains(.,'Create Gallery')]"));
	}
	public WebElement getGalleryTitle() {
		return driver.findElement(By.id("title"));
	}
	public WebElement getGalleryDescription() {
		return driver.findElement(By.id("description"));
	}
	public List<WebElement> getImgUrlInput() {
		return driver.findElements(By.cssSelector("input[type='url']"));
	}
	public WebElement getAddImage() {
		return driver.findElement(By.xpath("//button[contains(.,'Add image')]"));
	}
	public WebElement getSubmitButton() {
		return driver.findElement(By.cssSelector("button[type='submit']"));
	}
	public String getImg1() {
		return img1;
	}
	public String getImg2() {
		return img2;
	}
	public String getImg3() {
		return img3;
	}


	// Constructor
	public CreateGalleryPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	// Function
	public void createAGallery(String title, String description) {
		getGalleryTitle().sendKeys(title);
		getGalleryDescription().sendKeys(description);
		
		getAddImage().click();
		getAddImage().click();
		
		getImgUrlInput().get(0).sendKeys(getImg1());
		getImgUrlInput().get(1).sendKeys(getImg2());
		getImgUrlInput().get(2).sendKeys(getImg3());
		
		getSubmitButton().click();
	}
}
