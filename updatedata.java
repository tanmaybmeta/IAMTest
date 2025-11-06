package testngpractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class updatedata {
    public static void main(String[] args) throws EncryptedDocumentException, IOException {
        
        // Step 1: Open the Excel file for reading
        FileInputStream fis = new FileInputStream("src/testngpractice/excelfile.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        
        // Step 2: Update a cell value
        wb.getSheet("customer").getRow(1).getCell(2).setCellValue("Quality Analyst");
        
        // Step 3: Close the FileInputStream before writing
        fis.close();
        
        // Step 4: Write the updated content back to the same file
        FileOutputStream fos = new FileOutputStream("src/testngpractice/excelfile.xlsx");
        wb.write(fos);
        
        // Step 5: Close everything
        fos.close();
        wb.close();
        
        System.out.println("✅ Excel updated successfully!");
    }
}
