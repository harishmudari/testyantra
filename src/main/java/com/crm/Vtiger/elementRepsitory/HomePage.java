package com.crm.Vtiger.elementRepsitory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Vtiger.GenericUtility.WebDriverUtility;

public class HomePage extends WebDriverUtility{

	@FindBy(linkText = "Calendar")
	private WebElement calendarLnk;

	@FindBy(linkText = "Leads")
	private WebElement leadsrLnk;

	@FindBy(linkText = "Organizations")
	private WebElement organizationsLnk;

	@FindBy(linkText = "Contacts")
	private WebElement contactsLnk;

	@FindBy(linkText = "Opportunities")
	private WebElement opportunitiesLnk;

	@FindBy(linkText = "Products")
	private WebElement productsLnk;

	@FindBy(linkText = "Email")
	private WebElement emailLnk;

	@FindBy(linkText = "Trouble Tickets")
	private WebElement troubleTicketsLnk;

	@FindBy(linkText = "Dashboard")
	private WebElement dashboardLnk;

	@FindBy(xpath = "//td[contains(@onmouseover,'mail.com')]/img")
	private WebElement adminIconLnk;

	@FindBy(xpath = "//a[.='Sign Out']")
	private WebElement signOutLnk;

	public WebElement getCalendarLnk() {
		return calendarLnk;
	}

	public WebElement getLeadsrLnk() {
		return leadsrLnk;
	}

	public WebElement getOrganizationsLnk() {
		return organizationsLnk;
	}

	public WebElement getContactsLnk() {
		return contactsLnk;
	}

	public WebElement getOpportunitiesLnk() {
		return opportunitiesLnk;
	}

	public WebElement getProductsLnk() {
		return productsLnk;
	}

	public WebElement getEmailLnk() {
		return emailLnk;
	}

	public WebElement getTroubleTicketsLnk() {
		return troubleTicketsLnk;
	}

	public WebElement getDashboardLnk() {
		return dashboardLnk;
	}

	public WebElement getAdminIconLnk() {
		return adminIconLnk;
	}

	public WebElement getSignOut() {
		return signOutLnk;
	}

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public void clickOnCalender() {
		calendarLnk.click();
	}

	public void clickOnleads() {
		leadsrLnk.click();
	}

	public void clickOnOrganizations() {
		organizationsLnk.click();
	}

	public void clickOnContacts() {
		contactsLnk.click();
	}

	public void clickOnOpportunities() {
		opportunitiesLnk.click();
	}

	public void clickOnProducts() {
		productsLnk.click();
	}

	public void clickOnEmail() {
		emailLnk.click();
	}

	public void clickOnTroubleTickets() {
		troubleTicketsLnk.click();
	}

	public void clickOnDashboard() {
		dashboardLnk.click();
	}

	public void signOut(WebDriver driver) {
		mouseOverMovetoElement(driver, adminIconLnk);
		signOutLnk.click();
	}


}
