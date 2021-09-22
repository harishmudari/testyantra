package com.crm.Vtiger.LeadsTest;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.Vtiger.GenericUtility.BaseClass;
import com.crm.Vtiger.GenericUtility.ExcelUtility;
import com.crm.Vtiger.GenericUtility.JavaUtility;

import com.crm.Vtiger.elementRepsitory.CreateLeadPage;
import com.crm.Vtiger.elementRepsitory.HomePage;
import com.crm.Vtiger.elementRepsitory.LeadInfoPage;
import com.crm.Vtiger.elementRepsitory.LeadPage;


public class TC_10_createLeadByAssignToGroupTest extends BaseClass {

	
	@Test (groups = "RegressionSuites")
	
	public void loginTest() throws IOException, ParseException, InterruptedException {
	
	ExcelUtility eLib = new ExcelUtility();
	JavaUtility jvLib = new JavaUtility();
	
	
	
	//main lead module from page 
	HomePage hmp = new HomePage(driver);
	hmp.clickOnleads();
	
	
	//click on create new lead
	LeadPage lp1 = new LeadPage(driver);
	lp1.clickOnCreateLead();
	
	//provide mandatory fields with the help of excel sheet
	CreateLeadPage clp = new CreateLeadPage(driver);
	String LASTNAME = eLib.getDataFromExcel("testCase", 116, 5);
	clp.lastNameEdt(LASTNAME+jvLib.getRandomNumber(100));
	String COMPANYNAME = eLib.getDataFromExcel("testCase",116, 6);
	clp.companyNameEdt(COMPANYNAME);
	
	
	//click on group button  in assigned to
	clp.clickOnGroupBtn();
	
	//select assigned to menu
	String ASSIGNEDNAME = eLib.getDataFromExcel("testCase", 116, 7);
	clp.assignedToDrpDwn(ASSIGNEDNAME);
	
	// save the page
	clp.clickOnSavePageBtn();
	
	//take the auto generated lead number
	LeadInfoPage lip = new LeadInfoPage(driver);
	String LEADNOINFO = lip.leadNoInfo();
	
	// again click on the lead module
	hmp.clickOnleads();
	
	// put the auto generated lead number in search for text box
	lp1.clickOnSearchFor(LEADNOINFO);
	
	// select search in dropDown menu as lead no
	 String drpDwnMenuName = eLib.getDataFromExcel("testCase", 116, 8);
	lp1.selectFromSearchInDrpDwnMenu(drpDwnMenuName);
	
	// click on search now button
	lp1.clickOnSearchNow();
	
//	//wait for element to be ready with out thread.sleep 
//	WebElement waitForIt = lp1.getLeadNoInLeadMainPage();
//	wLib.waitForElementToBeClickable(driver, waitForIt);
	
	Thread.sleep(1000);
	// take the lead number in lead main page after search
	String leadNoInfoInLeadMainPage = lp1.leadNoInfoInLeadMainPage();
	
	//validations
	String actulValue = leadNoInfoInLeadMainPage;
	String expectedValue = LEADNOINFO;

	Assert.assertTrue(expectedValue.contains(actulValue));
	
	System.out.println("New Lead created with a diffrent assigned to menu"+"\n"+"and a unique auto generated LEAD NUMBER--> "+actulValue);
	}	
}
