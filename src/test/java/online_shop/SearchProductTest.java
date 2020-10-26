package online_shop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library.HomePage;
import library.HomePageFactory;
import utilities.Base;

public class SearchProductTest extends Base {

	

//	@Test
	public void searchItem() throws InterruptedException {

		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		
		driver.findElement(By.name("submit_search")).click();
			
		driver.findElement(By.xpath("//a[@title='Contact Us']")).click();
		
		driver.findElement(By.className("login")).click();

	}
	
	//@Test
	public void searchItemPageObjects() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		driver.get(prop.getProperty("url"));
		
		homePage.insertIntoSearchBox("dress");
		
		homePage.clickSearchBtn();
	
		homePage.clickContactUs();
		
		homePage.clickSignIn();

	}
	
	@Test
	public void searchItemPageFactory() throws InterruptedException {

		HomePageFactory homePage = new HomePageFactory(driver);
		driver.get(prop.getProperty("url"));
		
		homePage.insertIntoSearchBox("dress");
		
		homePage.clickSearchBtn();
	
		homePage.clickContactUs();
		
		homePage.clickSignIn();

	}
	
	

}
