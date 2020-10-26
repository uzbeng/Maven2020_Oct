package library;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	// List of element addresses
	By searchBox = By.id("search_query_top");
	
	By searchBtn = By.name("submit_search");
	
	By firstProduct = By.xpath("(//img[@title='Printed Summer Dress'])[2]");
	
	By contactUsBtn = By.xpath("//a[@title='Contact Us']");
	
	By signInBtn = By.className("login");	
	
	
	
	// Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}	
	
	// Actions on elements
	public void insertIntoSearchBox(String searchItem) {
		driver.findElement(searchBox).sendKeys(searchItem);
	}
	
	public void clickSearchBtn() {
		driver.findElement(searchBtn).click();
	}
	
	public void clickContactUs() {
		driver.findElement(contactUsBtn).click();
	}
	
	public void clickSignIn() {
		driver.findElement(signInBtn).click();
	}
	

}
