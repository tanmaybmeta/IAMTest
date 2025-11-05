package testngpractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ddl {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("src/testngpractice/excelfile.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		 int sr_no = (int) wb.getSheet("customer").getRow(1).getCell(0).getNumericCellValue();
		System.out.println(sr_no);
		
		String customer_name = wb.getSheet("customer").getRow(1).getCell(1).getStringCellValue();
		System.out.println(customer_name);
		
		String customer_description = wb.getSheet("customer").getRow(1).getCell(2).getStringCellValue();
		System.out.println(customer_description);
		
		
	
	}
}
