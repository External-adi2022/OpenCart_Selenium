package com.openCart.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.openCart.pageObject.MarketPlace_Page;

public class TC_MarketPlace_001 extends BaseClass {

	@Test(priority = 0)
	public void VisitHomePage() {
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get(baseURL);

		if (driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 1)
	public void NavitgateToMarketPlace() {
		MarketPlace_Page marketPlace = new MarketPlace_Page(driver);
		marketPlace.NavMarketPlace();
	}

}
