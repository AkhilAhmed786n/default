package dataDrivenframeworks;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./data/inputData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(7);
		Cell c = r.createCell(2);
		c.setCellValue("Noorullah");
		
		FileOutputStream fos = new FileOutputStream("./data/inputData.xlsx");
		wb.write(fos);
		System.out.println("Done Writing");
		
		
	}

}
