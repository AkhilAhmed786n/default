package dataDrivenframeworks;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	public static void main(String[] args) throws Throwable {
		for(int i=0;i<=10;i--) {
		FileInputStream fis = new FileInputStream("./data/inputData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		System.out.println(wb.getSheet("Sheet1").getRow(i).getCell(10).getStringCellValue());
	}
	}

}
