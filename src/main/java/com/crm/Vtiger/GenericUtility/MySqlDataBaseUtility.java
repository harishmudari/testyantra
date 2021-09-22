package com.crm.Vtiger.GenericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

/**
 * this class content generic method to get data from MY SQL data base
 * @author SOURAV
 *
 */
public class MySqlDataBaseUtility {
	/**
	 * this method will return the String value of the given query wrt statement and columnindex
	 * @param statement
	 * @param columnIndex
	 * @return
	 * @throws SQLException
	 */
	public String getDataFromMySqlDB(String statement, int columnIndex) throws SQLException {
		
		// resister to local My Sql Server
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		//established connection 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbName", "root", "root");
	
		//create statement 
		Statement stat = con.createStatement();
	
		//execute statement
		ResultSet result = stat.executeQuery(statement);
	
		String value=null;
		// get the data
		while (result.next()) {
			value = result.getString(columnIndex);
		}
		return value;
	}
}
