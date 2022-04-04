package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Domo_Particular_Data {
	
	public static Workbook wb;

	public static void Particular_Celldata() throws IOException {

		File f = new File("C:\\Usersrajalpandi\\eclipse-workspace\\Maven_Project_Class\\demo excel sheet.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);
		// Sheet s = wb.getSheet("");
		Row r = s.getRow(2);
		Cell c = r.getCell(1);
		CellType type = c.getCellType();
		if (type.equals(CellType.STRING)) {

			String stringvalue = c.getStringCellValue();
			System.out.println("Email id:" + stringvalue);

		} else if (type.equals(CellType.NUMERIC)) {
			double numericValue = c.getNumericCellValue();
			int a = (int) numericValue;
			
			System.out.println("Email passord:" + a);

		}

		wb.close();
	}

	public static void all_Data() throws IOException {
		File f = new File("C:\\Users\\Rajapandi\\Desktop\\demo1.xlsx");
		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {

			Row r = s.getRow(i);

			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {

				Cell c = r.getCell(j);

				CellType type = c.getCellType();

				if (type.equals(CellType.STRING)) {
					String value = c.getStringCellValue();
					System.out.println(value);

				} else if (type.equals(CellType.NUMERIC)) {
					double value = c.getNumericCellValue();
					int v = (int) value;
					String numeric = String.valueOf(v);

					System.out.println(numeric);

				}

				wb.close();

			}
		}
	}

	public static void Particular_column_Data() throws IOException {
		File f = new File("C:\\Usersrajalpandi\\eclipse-workspace\\Maven_Project_Class\\demo excel sheet.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {

			Row r = s.getRow(i);
			Cell c = r.getCell(1);
			CellType type = c.getCellType();
			if (type.equals(CellType.STRING)) {
				String value = c.getStringCellValue();
				System.out.println(value);

			} else if (type.equals(CellType.NUMERIC)) {
				double numericCellValue = c.getNumericCellValue();
				int d = (int) numericCellValue;
				String value = Integer.toString(d);

				System.out.println(value);
			}

		}
		wb.close();
	}


	public static void Particular_Data_Row() throws IOException {

		File f = new File("C:\\Usersrajalpandi\\eclipse-workspace\\Maven_Project_Class\\demo excel sheet.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(1);

		for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {

			Cell c = r.getCell(i);
			CellType type = c.getCellType();
			if (type.equals(CellType.STRING)) {
				String value = c.getStringCellValue();
				System.out.println(value);

			} else if (type.equals(CellType.NUMERIC)) {
				double numericCellValue = c.getNumericCellValue();
				int d = (int) numericCellValue;
				String value = Integer.toString(d);
				System.out.println(value);
			}
		}

		wb.close();

	}

	public static void main(String[] args) throws IOException {
		Particular_Celldata();
		System.out.println("______________________________________");
		all_Data();
		System.out.println("______________________________________");
		Particular_Data_Row();
		System.out.println("______________________________________");
	Particular_column_Data();
	}

}
