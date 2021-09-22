package com.crm.Vtiger.elementRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Vtiger.GenericUtility.WebDriverUtility;

public class CreateLeadPage extends WebDriverUtility{ // every page is a separate class name
	//locate all elements
	@FindBy(name = "firstname")
	private WebElement fstNameEdt;

	@FindBy(name = "lastname")
	private WebElement lstNameEdt;

	@FindBy(name = "company")
	private WebElement compName;

	@FindBy(name = "leadsource")
	private WebElement leadSourceLnk;

	@FindBy(name = "industry")
	private WebElement indDrpDwn;

	@FindBy(name = "leadstatus")
	private WebElement leadStsDrpDwn;

	@FindBy(name = "rating")
	private WebElement ratingDrpDwn;

	@FindBy(css = "[value='U']")
	private WebElement userBtn;

	@FindBy(css = "[value='T']")
	private WebElement grpBtn;

	@FindBy(xpath = "//span[@id='assign_team']/select")
	private WebElement assignedDrpDwn;

	@FindBy(css = "[title='Save [Alt+S]']")
	private WebElement saveBtn;

	//provide getters

	public WebElement getFstNameEdt() {
		return fstNameEdt;
	}

	public WebElement getLstNameEdt() {
		return lstNameEdt;
	}

	public WebElement getCompName() {
		return compName;
	}

	public WebElement getLeadSourceLnk() {
		return leadSourceLnk;
	}

	public WebElement getIndDrpDwn() {
		return indDrpDwn;
	}

	public WebElement getLeadStsDrpDwn() {
		return leadStsDrpDwn;
	}

	public WebElement getRatingDrpDwn() {
		return ratingDrpDwn;
	}

	public WebElement getUserBtn() {
		return userBtn;
	}

	public WebElement getGrpBtn() {
		return grpBtn;
	}

	public WebElement getAssignedDrpDwn() {
		return assignedDrpDwn;
	}

	//constructor initialization
	public CreateLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//business methods
	public void lastNameEdt(String lastName) {
		lstNameEdt.sendKeys(lastName);
	}

	public void companyNameEdt(String companyName) {
		compName.sendKeys(companyName);
	}

	public void leadSourceDrpDwn(String leadSourceDrpDwnName) {
		select(leadSourceLnk, leadSourceDrpDwnName);
	}

	public void industryDrpDwn(String industryDrpDwnName) {
		select(indDrpDwn, industryDrpDwnName);
	}

	public void leadStatusDrpDwn(String leadStatusDrpDwnName) {
		select(leadStsDrpDwn, leadStatusDrpDwnName);
	}

	public void ratingDrpDwn(String ratingDrpDwnName) {
		select(ratingDrpDwn, ratingDrpDwnName);
	}

	public void assignedToDrpDwn(String assignToDrpDwnName) {
		select(assignedDrpDwn, assignToDrpDwnName);
	}

	public void clickOnGroupBtn() {
		grpBtn.click();
	}

	public void clickOnSavePageBtn() {
		saveBtn.click();
	}















}
