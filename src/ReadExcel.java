import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws FileNotFoundException, IOException {
        readFromExcel("patientinfo.xls");
    }
    
    
    public static void readFromExcel(String file) throws IOException{
        HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(file));
        HSSFSheet myExcelSheet = myExcelBook.getSheet("Patient info sheet");
        for(int n=0; n<5; n++) {
        HSSFRow row = myExcelSheet.getRow(n);

        if(row.getCell(0).getCellType() == HSSFCell.CELL_TYPE_STRING){
            String id = row.getCell(0).getStringCellValue();
            System.out.println("ID : " + id);
        }
        
        if(row.getCell(1).getCellType() == HSSFCell.CELL_TYPE_STRING){
            String name = row.getCell(1).getStringCellValue();
            System.out.println("name : " + name);
        }
        
        if(row.getCell(2).getCellType() == HSSFCell.CELL_TYPE_STRING){
            String email = row.getCell(2).getStringCellValue();
            System.out.println("email :" + email);
        }
        if(row.getCell(3).getCellType() == HSSFCell.CELL_TYPE_STRING){
            String country = row.getCell(3).getStringCellValue();
            System.out.println("Country : " + country);
        }
        
        if(row.getCell(4).getCellType() == HSSFCell.CELL_TYPE_STRING){
            String problem = row.getCell(4).getStringCellValue();
            System.out.println("problem : " + problem+"\n");
        }
        n=n+1;
    }
        
        
        myExcelBook.close();
        
    }
	}
