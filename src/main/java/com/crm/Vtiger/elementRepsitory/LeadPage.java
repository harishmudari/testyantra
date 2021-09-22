package com.crm.Vtiger.elementRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Vtiger.GenericUtility.WebDriverUtility;

public class LeadPage extends WebDriverUtility{ // every page separate class
	//locate all elements
	@FindBy(css = "[title='Create Lead...']")
	private WebElement createLeadLnk;

	@FindBy(name = "search_text")
	private WebElement searchForText;

	@FindBy(name = "submit")
	private WebElement searchNowBtn;

	@FindBy(name = "search_field")
	private WebElement searchInDrpDwnLnk;
	
	@FindBy(xpath = "//input[@name='selected_id']/../following-sibling::td[1]")
	private WebElement leadNoInLeadMainPage;
	

	//provide getters
	public WebElement getCreateLeadLnk() {
		return createLeadLnk;
	}

	public WebElement getSearchForLnk() {
		return searchForText;
	}

	public WebElement getSearchNowLnk() {
		return searchNowBtn;
	}

	public WebElement getSearchInDrpDwnLnk() {
		return searchInDrpDwnLnk;
	}

	public WebElement getLeadNoInLeadMainPage() {
		return leadNoInLeadMainPage;
	}

	//initialize through constructor
	public LeadPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//provide business methods
	public void clickOnCreateLead() {
		createLeadLnk.click();
	}

	public void clickOnSearchFor(String searchName) {
		searchForText.sendKeys(searchName);
	}

	public void clickOnSearchNow() {
		searchNowBtn.click();
	}

	public void selectFromSearchInDrpDwnMenu(String drpDwnMenuName) {
		select(searchInDrpDwnLnk, drpDwnMenuName);
	}
	
	public String leadNoInfoInLeadMainPage() {
		return leadNoInLeadMainPage.getText();
	}
}
