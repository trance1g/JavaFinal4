import java.util.*;
import java.text.*;
public class TeamLeaderLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instaniate decimalformat object
		DecimalFormat d1 = new DecimalFormat("$#,##0.00");
		//instantiate team leader class
		TeamLeader t1 = new TeamLeader();
		
		//calling setters to give the values to the methods
		t1.setPayRate(9.50);
		t1.setMonthlyBonus(250);
		t1.setReqTraining(50);
		t1.setCompleteTraining(14);
		
		//display output
		System.out.println("Team Leader Pay Rate: " + t1.getPayRate());
		System.out.println("Team Leader Monthly Bonus: " + d1.format(t1.getMonthlyBonus()));
		System.out.println("Team Leader Hours of Training to Complete: " + t1.getReqTraining());
		System.out.println("Team Leader Hours of Training finished: " + t1.getCompleteTraining());

	}

}
