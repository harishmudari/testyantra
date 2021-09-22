package com.crm.Vtiger.elementRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadInfoPage {

	// locators
	@FindBy(className = "dvHeaderText")
	private WebElement headInfo;

	@FindBy(id = "dtlview_Last Name")
	private WebElement lastNameInfo;
	
	@FindBy(id = "dtlview_Company")
	private WebElement companyInfo;
	
	@FindBy(xpath = "//td[.='Lead No']/../td[4]")
	private WebElement leadNoInfo;
	
	@FindBy(id = "dtlview_Lead Source")
	private WebElement leadSourceInfo;
	
	@FindBy(id = "dtlview_Industry")
	private WebElement industryInfo;
	
	@FindBy(id = "dtlview_Lead Status")
	private WebElement leadStatusInfo;
	
	@FindBy(id = "dtlview_Rating")
	private WebElement ratingInfo;
	
	
	// getters

	public WebElement getHeadInfo() {
		return headInfo;
	}

	public WebElement getLastNameInfo() {
		return lastNameInfo;
	}

	public WebElement getCompanyInfo() {
		return companyInfo;
	}

	public WebElement getLeadNoInfo() {
		return leadNoInfo;
	}

	public WebElement getLeadSourceInfo() {
		return leadSourceInfo;
	}

	public WebElement getIndustryInfo() {
		return industryInfo;
	}

	public WebElement getLeadStatusInfo() {
		return leadStatusInfo;
	}

	public WebElement getRatingInfo() {
		return ratingInfo;
	}
	
	//constructor
	public LeadInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//business methods
	public String lastNameInfo() {
		return lastNameInfo.getText();
	}
	
	public String companyNameInfo() {
		return companyInfo.getText();
	}

	public String leadSourceNameInfo() {
		return leadSourceInfo.getText();
	}

	public String industryNameInfo() {
		return industryInfo.getText();
	}

	public String leadNoInfo() {
		return leadNoInfo.getText();
	}

	public String leadStatusInfo() {
		return leadStatusInfo.getText();
	}

	public String ratingInfo() {
		return ratingInfo.getText();
	}
		
}
