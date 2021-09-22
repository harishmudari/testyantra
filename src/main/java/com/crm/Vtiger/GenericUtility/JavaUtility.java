package com.crm.Vtiger.GenericUtility;

import java.util.Random;

/**
 * this class contains generic method of java specific method
 * @author SOURAV
 *
 */
public class JavaUtility {
	/**
	 * this method returns the random number wrt number range
	 * @param numRange
	 * @return
	 */
	public int getRandomNumber(int numRange) {
		return new Random().nextInt(numRange);
	}
}
