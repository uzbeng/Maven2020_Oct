package lesson24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.Base;

public class WebdriverWaitExample extends Base {

	public void testCase() throws InterruptedException {
		
		driver.get(prop.getProperty("url"));

		// First page
		driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();

		// Second page  (Shopping cart) takes up to 10 seconds.
		
		WebDriverWait w = new WebDriverWait(driver, 10);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("cart_title"))); // pause
		
		//Thread.sleep(10); 
		
		driver.findElement(By.id("cart_title")).getText();
		
		

		

	}

}
