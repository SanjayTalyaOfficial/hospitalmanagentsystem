import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws FileNotFoundException, IOException { //HSSF (Horrible SpreadSheet Format) – reads and writes Microsoft Excel (XLS) format files
		HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream("excel.xls"));		//Here the XLs is known as workbook. 
		HSSFSheet sheet = workbook.getSheetAt(0);										//Starting from 0th position
		HSSFRow row = sheet.getRow(0);
		if (row.getCell(0).getCellType() == HSSFCell.CELL_TYPE_STRING) {				//Have to sort according to certain aspects based on patient details
			System.out.println(row.getCell(0).getStringCellValue());
		}
		if (row.getCell(1).getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
			System.out.println(row.getCell(1).getDateCellValue());
		}
	}
}
