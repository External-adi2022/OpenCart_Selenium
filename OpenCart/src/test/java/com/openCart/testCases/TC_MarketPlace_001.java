package com.openCart.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.openCart.pageObject.MarketPlace_Page;

public class TC_MarketPlace_001 extends BaseClass {

	@Test(priority = 0)
	public void VisitHomePage() {
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 1)
	public void NavitgateToMarketPlace() throws InterruptedException {
		MarketPlace_Page marketPlace = new MarketPlace_Page(driver);
		marketPlace.NavMarketPlace();

		if (driver.getTitle().equals("OpenCart - Marketplace")) {
			Assert.assertTrue(true, "Marketplace Page");
		} else {
			Assert.assertTrue(false, "Not Marketplace Page");
		}
	}

	@Test(priority = 2)
	public void Search_FacebookForOpenCart() throws InterruptedException {
		MarketPlace_Page marketPlace = new MarketPlace_Page(driver);
		marketPlace.clickOnSearchBox();
		marketPlace.enterTextOnSearchBox(fbCartText);
		marketPlace.clickSearchIcon();
		WebElement CardView = driver.findElement(
				By.xpath("//div[@id='extension-list']/div[2]/div[1]/section/div[@class='extension-preview']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CardView);
		Thread.sleep(3000);
		marketPlace.setSearchResult(fbCartText);
	}
}
