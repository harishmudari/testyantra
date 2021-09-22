package com.crm.Vtiger.GenericUtility;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * this class content webDriver specific generic methods
 * 
 * @author SOURAV
 *
 */
public class WebDriverUtility {

	/**
	 * this methods wait for 20 seconds to load the page
	 * 
	 * @param driver
	 */
	public void waitForPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	/**
	 * this method will maximize the window
	 * 
	 * @param driver
	 */
	public void maximiseWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * this method will select the dropDown menu using index
	 * 
	 * @param element
	 * @param index
	 */
	public void select(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	/**
	 * this method will select the dropdown menu using visibleText
	 * 
	 * @param element
	 * @param index
	 */
	public void select(WebElement element, String visibleText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
	}

	/**
	 * this method will move the mouse into the perticular element
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseOverMovetoElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	/**
	 * this method use for right click actions
	 * 
	 * @param driver
	 * @param element
	 */
	public void rightClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}

	/**
	 * this method use for double click on a perticula webelement
	 * 
	 * @param driver
	 * @param element
	 */
	public void doubleClick(WebDriver driver, WebElement element) {

		Actions act = new Actions(driver);
		act.doubleClick().perform();
	}

	/**
	 * this method use to accept the alert popup
	 * 
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

	/**
	 * this method use to dismiss the alert popup
	 * 
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}

	/**
	 * switch to frame by index
	 * 
	 * @param driver
	 * @param index
	 */
	public void swithToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * switch to frame by id
	 * 
	 * @param driver
	 * @param id
	 */
	public void swithToFrame(WebDriver driver, String id) {
		driver.switchTo().frame(id);
	}

	/**
	 * Switch to frame by webElement
	 * 
	 * @param driver
	 * @param frameelement
	 */

	public void swithToFrame(WebDriver driver, WebElement frameelement) {
		driver.switchTo().frame(frameelement);
	}

	/**
	 * this method switch child to parent and parent to child by partial contains
	 * text
	 * 
	 * @param driver
	 * @param pertialWinTitle
	 */
	public void swithToWindow(WebDriver driver, String pertialWinTitle) {
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it = windowHandles.iterator();
		while (it.hasNext()) {
			String winid = it.next();
			String actTitle = driver.switchTo().window(winid).getTitle();
			if (actTitle.contains(pertialWinTitle)) {
				driver.switchTo().window(actTitle);
				break;
			}
		}
	}

	/**
	 * this method wait for particular webElement explicitly for 20 seconds
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeVisible(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	/**
	 * this method wiat for particular webElement explicitly for 20 seconds
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
