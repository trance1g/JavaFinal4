import java.util.*;
import java.text.*;
public class PayDemo {
	
	public static void main(String[] args) {
		DecimalFormat d = new DecimalFormat("$#,##0.00");
		 double wages[] = {17.25, 40.75, 15.0, 12.0, 20.65, 25.50, 13.5};
		 String employees[] = {"Joe              ", "Jill              ", "Jack            ", "Jessica            ", "James          ", "Jenn            ", "Jim            "};
		 
		 Pay p1 = new Pay();
		 
		 for(String name : employees){
			 System.out.print(name);
		 }
		 
		 System.out.println();
		 
		 for(double payRate : wages){
			 System.out.print(payRate + "            ");
		 }
		 
		 System.out.println(p1.getHighLow(wages));
	
	
	}
}
