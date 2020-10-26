package lesson24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.Base;

public class Asserts extends Base {

	// Hard Assert

	// @Test
	public void hardAssert() {
		driver.get(prop.getProperty("url"));

		driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();

		List<WebElement> cartSummary = driver.findElements(By.id("cart_title"));

		Assert.assertTrue(false, "First assert"); // Showstopper/High priority

		Assert.assertTrue(cartSummary.size() < 0, "Cart summary page opens");

	}

	// @Test
	public void softAssert() {
		SoftAssert softAssert = new SoftAssert();

		driver.get(prop.getProperty("url"));

		driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();

		List<WebElement> cartSummary = driver.findElements(By.id("cart_title"));

		softAssert.assertTrue(false, "First assert");

		softAssert.assertTrue(cartSummary.size() < 0, "Cart summary page opens");

		softAssert.assertAll();

	}

	@Test
	public void mixedAssert() {
		SoftAssert softAssert = new SoftAssert();

		driver.get(prop.getProperty("url"));

		driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();

		List<WebElement> cartSummary = driver.findElements(By.id("cart_title"));

		// not main function
		softAssert.assertTrue(false, "First assert");

		// not main function
		softAssert.assertTrue(false, "Second assert");

		// Main function
		Assert.assertTrue(cartSummary.size() > 0, "Cart summary page opens");

		// not main function
		softAssert.assertTrue(false, "Third assert");

		softAssert.assertAll();

	}

}
