import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;

public class WriteExcel {
	public static void main(String[] args) throws IOException {
		
		//Login module
		String username, password;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter username:");//username:user
        username = s.nextLine();
        System.out.print("Enter password:");//password:user
        password = s.nextLine();
        if(username.equals("user") && password.equals("user"))
        {
            System.out.println("Authentication Successful\n\n");
            
            //Getting Input from the user 
            
            Scanner sc = new Scanner(System.in);
    		System.out.println("Enter your name");
    		String name=sc.nextLine();
    		System.out.println("Enter your phone Number");
    		String phone=sc.nextLine();
    		System.out.println("Enter your email");
    		String email=sc.nextLine();
    		System.out.println("Enter your country");
    		String country=sc.nextLine();
    		System.out.println("Enter your problem");
    		String problem=sc.nextLine();
    		sc.close();
    		System.out.println("Your Name: "+name);
    		System.out.println("Your Phone number: "+phone);
    		System.out.println("Your Email: "+email);
    		System.out.println("Your Country: "+country);
    		System.out.println("Your Problem: "+problem);
    		
    		
    		ArrayList<String> details = new ArrayList<String>();
    		details.add(name);
    		details.add(phone);
    		details.add(email);
    		details.add(country);
    		details.add(problem);
            
            //writing into workbook
    		HSSFWorkbook workbook = new HSSFWorkbook();
    		HSSFSheet sheet = workbook.createSheet("FirstExcelSheet");
    		HSSFRow row = sheet.createRow(0);
    		HSSFCell cell = row.createCell(0);
    		cell.setCellValue("1. Cell");
    		
    		cell = row.createCell(1);
    		DataFormat format = workbook.createDataFormat();
    		CellStyle dateStyle = workbook.createCellStyle();
    		dateStyle.setDataFormat(format.getFormat("dd.mm.yyyy"));
    		cell.setCellStyle(dateStyle);
    		cell.setCellValue(new Date());
    		
    		row.createCell(2).setCellValue("3. Cell");
    		
    		sheet.autoSizeColumn(1);
    		
    		workbook.write(new FileOutputStream("excel.xls"));
    		System.out.println("Successfully wrote to the file");
    		workbook.close();
        }
        else
        {
            System.out.println("Authentication Failed");
        }
        s.close();
        
        
	}
}
