package com.openCart.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class TC_MarketPlace_001 extends BaseClass{
	
	@Test
	public void VisitHomePage() {
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get(baseURL);	
	}

}
