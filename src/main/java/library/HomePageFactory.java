package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {
	
	private WebDriver driver;
	
	// List of elements
	@FindBy(id="search_query_top")
	private WebElement searchBox;
	
	@FindBy(name = "submit_search")
	private WebElement searchBtn;
	
	@FindBy(xpath = "//a[@title='Contact Us']")
	private WebElement contactUsBtn;
	
	@FindBy(className = "login")
	private WebElement signInBtn;
	
	
	// Constructor
	public HomePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
		
	// Actions
	public void insertIntoSearchBox(String searchItem) {
		searchBox.sendKeys(searchItem);
	}
	
	public void clickSearchBtn() {
		searchBtn.click();
	}
	
	public void clickContactUs() {
		contactUsBtn.click();
	}
	
	public void clickSignIn() {
		signInBtn.click();
	}

}
