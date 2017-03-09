import java.util.*;
import java.text.*;
public class ShiftSupervisorLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat d1 = new DecimalFormat("$#,##0.00");
		ShiftSupervisor s1 = new ShiftSupervisor();
		
		boolean valid = false;
		String input = "";
		int value = 0;
		
		System.out.println("Enter Shift Supervisor's name: ");
		s1.setName(keyboard.nextLine());
		System.out.println("Enter your Employee Number in 'XXX-L' format, where the X's represent numbers 0-9"
				+ "\nand the L represents a letter A-M: ");
		
		for(int x = 0; x < 3; x++){
			do{
				System.out.println("Enter your employee number: ");
				input = keyboard.nextLine();
				
				value = Integer.parseInt(input);
				
				if(value <= 9 && value >= 0){
					valid = true;
					s1.setEmployeeNum(input);
				}else{
					System.out.println("The number has to be between 0-9");
				}
				
			}while(valid == false);
			valid = false;
		}
		
		do{
			System.out.println("Enter the letter associated with the shift supervisor's employee number: ");
			
			input = keyboard.nextLine();
			
			switch(input.toLowerCase()){
				case "a":
					valid = true;
					s1.setEmployeeNum(input);
					break;
				case "b":
					valid = true;
					s1.setEmployeeNum(input);
					break;
				case "c":
					valid = true;
					s1.setEmployeeNum(input);
					break;
				case "d":
					valid = true;
					s1.setEmployeeNum(input);
					break;
				case "e":
					valid = true;
					s1.setEmployeeNum(input);
					break;
				case "f":
					valid = true;
					s1.setEmployeeNum(input);
					break;
				case "g":
					valid = true;
					s1.setEmployeeNum(input);
					break;
				case "h":
					valid = true;
					s1.setEmployeeNum(input);
					break;
				case "i":
					valid = true;
					s1.setEmployeeNum(input);
					break;
				case "j":
					valid = true;
					s1.setEmployeeNum(input);
					break;
				case "k":
					valid = true;
					s1.setEmployeeNum(input);
					break;
				case "l":
					valid = true;
					s1.setEmployeeNum(input);
					break;
				case "m":
					valid = true;
					s1.setEmployeeNum(input);
					break;
				default:
					System.out.println("Invalid entry, please try again, entering  A-M");
					break;
			}
			
			
		}while(valid = false);
		valid = false;
		
		System.out.println("Enter Shift Supervisors's Hire Date: ");
		s1.setHireDate(keyboard.nextLine());
		
		System.out.println("Enter Shift Supervisors Annual Salary: ");
		s1.setAnnualSalary(keyboard.nextDouble());
		
		System.out.println("Enter Shift Supervisor's Annual Bonus: ");
		s1.setAnnualBonus(keyboard.nextDouble());
		
		
		System.out.println("Shift Supervisor Name: " + s1.getName());
		System.out.println("Shift Supervisor Employee Number: " + s1.getEmployeeNum());
		System.out.println("Shift Supervisor Hire Date: " + s1.getHireDate());
		System.out.println("Shift Supervisor Annual Salary: " + d1.format(s1.getAnnualSalary()));
		System.out.println("Shift Supervisor Annual Bonus: " + d1.format(s1.getAnnualBonus()));

	}

}
