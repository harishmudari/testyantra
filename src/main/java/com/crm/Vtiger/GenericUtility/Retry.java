package com.crm.Vtiger.GenericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	int count=0;
	int resultConut=3;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub

		while (count<resultConut) {
			count++;
			return true;
		}
		return false;
	}
}
