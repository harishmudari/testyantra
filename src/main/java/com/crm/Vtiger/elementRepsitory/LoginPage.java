package com.crm.Vtiger.elementRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage { 				 // rule 1 - every page is a separate class 

	@FindBy(name = "user_name")    		 //rule 2 - identify all element using @Findby and @Findby's
	private WebElement userNameEdt;		 // rule 3 - declare all the webElement as private so that it 
										 // it can be accessible with in the class where it is declare 

	@FindBy(name = "user_password")
	private WebElement passWordEdt;

	@FindBy(id = "submitButton")
	private WebElement logInButton;

	public WebElement getUserNameEdt() {  // rule 4 - return the private element through getters
									      //concept of encapsulation
		return userNameEdt;
	}

	public WebElement getPassWordEdt() {
		return passWordEdt;
	}

	public WebElement getLogInButton() {
		return logInButton;
	}
	
	//rule - 4 create a constructor and use pageFactory class to initialize 
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// rule - 6 access the webElements using getters business method 
	public void logIn(String username, String password) {
		userNameEdt.sendKeys(username);
		passWordEdt.sendKeys(password);
		logInButton.click();
	}
}
