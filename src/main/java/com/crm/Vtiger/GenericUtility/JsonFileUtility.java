package com.crm.Vtiger.GenericUtility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * this class contains generic method of JSON file 
 * @author SOURAV
 *
 */
public class JsonFileUtility {
	/**
	 * this method return the value of the particular key present in json file
	 * @param key
	 * @return
	 * @throws IOException
	 * @throws ParseException
	 */
	public String readDataFromJson(String key) throws IOException, ParseException {

		// read the data from json
		FileReader reader = new FileReader(IpathConstants.jsonFilePath);

		// convert json file into java object
		JSONParser jsonObj = new JSONParser();
		Object javaObj = jsonObj.parse(reader);

		//type cast java object to hashmap
		HashMap map=(HashMap)javaObj;

		// get the value
		String value = map.get(key).toString();

		//return the value
		return value;
	}
}
