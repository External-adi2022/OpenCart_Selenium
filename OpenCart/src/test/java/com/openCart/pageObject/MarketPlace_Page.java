package com.openCart.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MarketPlace_Page {

	WebDriver ldriver;

	public MarketPlace_Page(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[text()='Marketplace']")
	private WebElement navMarket;

	public void NavMarketPlace() {
		navMarket.click();
	}

	@FindBy(name = "filter_search")
	private WebElement txtfbCart;

	public void clickOnSearchBox() {
		txtfbCart.click();
	}

	String cartTxtfb;

	public void enterTextOnSearchBox(String fbCartText) {
		txtfbCart.sendKeys(fbCartText);
		cartTxtfb = fbCartText;
	}

	@FindBy(id = "button-search")
	private WebElement clkSearch;

	public void clickSearchIcon() {
		clkSearch.click();
	}

	@FindBy(xpath = "//div[@id='extension-list']/div[2]/div/section/div[@class='extension-name']/p/a")
	List<WebElement> searchList;
	WebElement splitString;

	public void setSearchResult(String fbCartText) {
		for (int i = 0; i < searchList.size(); i++) {
			String strSearch = searchList.get(i).getText();
			if (strSearch.equals(fbCartText)) {
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		}
	}
}
