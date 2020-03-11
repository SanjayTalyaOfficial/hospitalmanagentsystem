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
public class WriteNewNew {
	public static void main(String[] args) throws IOException {

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
}
}