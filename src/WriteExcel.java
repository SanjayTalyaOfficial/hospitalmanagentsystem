import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.*;

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
            
            /*Scanner sc = new Scanner(System.in);
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
    		details.add(problem);*/
            
            //writing into workbook
    		
			@SuppressWarnings("resource")
			HSSFWorkbook workbook = new HSSFWorkbook();
    		HSSFSheet sheet = workbook.createSheet("Patient info sheet");
    		
    		Map<String, Object[]> data = new HashMap<String, Object[]>();
    		data.put("1", new Object[] {"ID", "Name", "Email", "Country", "Problem"});
    		data.put("2", new Object[] {"1", "Amber", "amber@aceweb.eu", "Europe", "Stones"});
    		data.put("3", new Object[] {"2", "Shiva", "shiv@flipkart.in", "India", "cancer"});
    		data.put("4", new Object[] {"3", "Makena", "makena@example.com", "Brazil", "Knee surgery"});
    		
    		
    		Set<String> keyset = data.keySet();
    		int rownum = 0;
    		for (String key : keyset) {
    			Row row = sheet.createRow(rownum++);
    			Object [] objArr = data.get(key);
    			int cellnum = 0;
    			for (Object obj : objArr) {
    				Cell cell = row.createCell(cellnum++);
    				if(obj instanceof Date) 
    					cell.setCellValue((Date)obj); //for filling in date  to cell
    				else if(obj instanceof Boolean)
    					cell.setCellValue((Boolean)obj); //for fillin in boolean values to cell
    				else if(obj instanceof String)
    					cell.setCellValue((String)obj); // for fillnin in string values into cell
    				else if(obj instanceof Double)
    					cell.setCellValue((Double)obj); //for filling double values to cell
    			}
    		}
    		
    		try {
    			FileOutputStream out = 
    					new FileOutputStream(new File("patientinfo.xls"));
    			workbook.write(out);
    			out.close();
    			System.out.println("Excel written successfully..");
    			
    		} catch (FileNotFoundException e) {
    			e.printStackTrace();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
        
        
	}
	}
}

