import java.util.*;
public class MonthLauncher {

	public static void main(String[] args) throws MonthException{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
	
		
		
		Month p1 = new Month(43);
		Month p2 = new Month("january");
		
		if(p1.getMonthNumber() < 1 || p1.getMonthNumber() > 12){
			throw new MonthException();
		}else{
			System.out.println("For the value 0, it will print out " + p1.toString());
			System.out.println("For the value John, it will print out " + p2.toString());
		}
		
		
		
		
	}

}
