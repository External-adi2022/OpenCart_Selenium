package com.openCart.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MarketPlace_Page {

	WebDriver ldriver;

	public MarketPlace_Page(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

}
