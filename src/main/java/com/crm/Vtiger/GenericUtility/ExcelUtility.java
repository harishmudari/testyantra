package com.crm.Vtiger.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this class contains the generic method to read and write data from excel sheet
 * @author SOURAV
 *
 */
public class ExcelUtility {
	/**
	 * this method provide the data from excel sheet
	 * @param sheet
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public String getDataFromExcel(String sheet,int rownum, int cellnum) throws EncryptedDocumentException, IOException {
		// first creating a java object of the excel file through file input stream
		FileInputStream fis = new FileInputStream(IpathConstants.excelFilePath);

		//send data to that object 
		Workbook wb = WorkbookFactory.create(fis);

		// put the sheet name
		Sheet sht = wb.getSheet(sheet);

		// put the Row num
		Row row = sht.getRow(rownum);

		// put the cell num
		Cell cell = row.getCell(cellnum);
		
		DataFormatter format = new DataFormatter();

		// get the value 
		String value = format.formatCellValue(cell);

		// return the value
		return value;
	}

	/**
	 * this method set the data back to excel sheet
	 * @param sheet
	 * @param rownum
	 * @param cellnum
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setDataInExcel(String sheet,int rownum, int cellnum, String value) throws EncryptedDocumentException, IOException {
		// first creating a java object of the excel file through file input stream
		FileInputStream fis = new FileInputStream(IpathConstants.excelFilePath);

		//send data to that object 
		Workbook wb = WorkbookFactory.create(fis);

		// put the sheet name
		Sheet sht = wb.getSheet(sheet);

		// put the Row num
		Row row = sht.getRow(rownum);

		// put the cell num
		Cell cell = row.getCell(cellnum);

		// set the value 
		cell.setCellValue(value);

		// again open the same excel file in file output stream 
		FileOutputStream fos = new FileOutputStream(IpathConstants.excelFilePath);

		// write the value in the exact area
		wb.write(fos);

		// close the workbook 
		wb.close();
	}
}
