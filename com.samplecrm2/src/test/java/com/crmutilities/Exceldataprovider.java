package com.crmutilities;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataprovider {

	XSSFWorkbook wb;
	public Exceldataprovider() 
	{
		File src=new File("./Testdata/Data.xlsx");
		try {
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		} catch (Exception e) {
			
			System.out.println("Unable to read"+e.getMessage());
		} 
		
			}
	
	public String getstringdata(int sheetIndex,int row,int column)
	{
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();	
		}
	
	public String getstringdata(String sheetname,int row,int column)
{
	return wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();	
	}
	
	public double getnumericdata(String sheetname,int row,int column)
{
		return wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
	}
	
}
