package com.openCart.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketPlace_Page {

	WebDriver ldriver;

	public MarketPlace_Page(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[text()='Marketplace']")
	private WebElement navMarket;
	
	public void NavMarketPlace() {
		navMarket.click();		
	}

}
