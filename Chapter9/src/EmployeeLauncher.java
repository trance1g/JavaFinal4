import java.text.DecimalFormat;
import java.util.Scanner;

public class EmployeeLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		DecimalFormat d1 = new DecimalFormat("$#,##0.00");
		
		Employee e1 = new Employee();
		ProductionWorker p1 = new ProductionWorker();
		

		boolean valid = false;
		String input = "";
		int shift = 0;
		int value = 0;
		
		
		System.out.println("Enter your name: ");
		e1.setName(keyboard.nextLine());
		System.out.println("Enter your Employee Number in 'XXX-L' format, where the X's represent numbers 0-9"
				+ "\nand the L represents a letter A-M: ");
		
		for(int x = 0; x < 3; x++){
			do{
				System.out.println("Enter your employee number: ");
				input = keyboard.nextLine();
				
				value = Integer.parseInt(input);
				
				if(value <= 9 && value >= 0){
					valid = true;
					e1.setEmployeeNum(input);
				}else{
					System.out.println("The number has to be between 0-9");
				}
				
			}while(valid == false);
			valid = false;
		}
		
		do{
			System.out.println("Enter the letter associated with your employee number: ");
			
			input = keyboard.nextLine();
			
			switch(input.toLowerCase()){
				case "a":
					valid = true;
					e1.setEmployeeNum(input);
					break;
				case "b":
					valid = true;
					e1.setEmployeeNum(input);
					break;
				case "c":
					valid = true;
					e1.setEmployeeNum(input);
					break;
				case "d":
					valid = true;
					e1.setEmployeeNum(input);
					break;
				case "e":
					valid = true;
					e1.setEmployeeNum(input);
					break;
				case "f":
					valid = true;
					e1.setEmployeeNum(input);
					break;
				case "g":
					valid = true;
					e1.setEmployeeNum(input);
					break;
				case "h":
					valid = true;
					e1.setEmployeeNum(input);
					break;
				case "i":
					valid = true;
					e1.setEmployeeNum(input);
					break;
				case "j":
					valid = true;
					e1.setEmployeeNum(input);
					break;
				case "k":
					valid = true;
					e1.setEmployeeNum(input);
					break;
				case "l":
					valid = true;
					e1.setEmployeeNum(input);
					break;
				case "m":
					valid = true;
					e1.setEmployeeNum(input);
					break;
				default:
					System.out.println("Invalid entry, please try again, entering  A-M");
					break;
			}
			
			
		}while(valid = false);
		valid = false;
		
		System.out.println("Enter your Hire Date: ");
		e1.setHireDate(keyboard.nextLine());
		
		System.out.println("Enter Production Worker's name: ");
		p1.setName(keyboard.nextLine());
		System.out.println("Enter your Employee Number in 'XXX-L' format, where the X's represent numbers 0-9"
				+ "\nand the L represents a letter A-M: ");
		
		for(int x = 0; x < 3; x++){
			do{
				System.out.println("Enter your Production Worker's employee number: ");
				input = keyboard.nextLine();
				
				value = Integer.parseInt(input);
				
				if(value <= 9 && value >= 0){
					valid = true;
					p1.setEmployeeNum(input);
				}else{
					System.out.println("The number has to be between 0-9");
				}
				
			}while(valid == false);
			valid = false;
		}
		
		do{
			System.out.println("Enter the letter associated with production workers employee number: ");
			
			input = keyboard.nextLine();
			
			switch(input.toLowerCase()){
				case "a":
					valid = true;
					p1.setEmployeeNum(input);
					break;
				case "b":
					valid = true;
					p1.setEmployeeNum(input);
					break;
				case "c":
					valid = true;
					p1.setEmployeeNum(input);
					break;
				case "d":
					valid = true;
					p1.setEmployeeNum(input);
					break;
				case "e":
					valid = true;
					p1.setEmployeeNum(input);
					break;
				case "f":
					valid = true;
					p1.setEmployeeNum(input);
					break;
				case "g":
					valid = true;
					p1.setEmployeeNum(input);
					break;
				case "h":
					valid = true;
					p1.setEmployeeNum(input);
					break;
				case "i":
					valid = true;
					p1.setEmployeeNum(input);
					break;
				case "j":
					valid = true;
					p1.setEmployeeNum(input);
					break;
				case "k":
					valid = true;
					p1.setEmployeeNum(input);
					break;
				case "l":
					valid = true;
					p1.setEmployeeNum(input);
					break;
				case "m":
					valid = true;
					p1.setEmployeeNum(input);
					break;
				default:
					System.out.println("Invalid entry, please try again, entering  A-M");
					break;
			}
			
			
		}while(valid = false);
		valid = false;
		
		System.out.println("Enter your Hire Date: ");
		p1.setHireDate(keyboard.nextLine());
		
		
		
		System.out.println("Enter either shift 1 or shift 2 for a Production Worker: ");
		shift = keyboard.nextInt();
		p1.setShift(shift);
		
		while(shift != 2 && shift != 1){
			System.out.println("You have entered a value that is not 1 or 2, please try again.");
			System.out.println("Enter either shift 1 or shift 2 for a Production Worker: ");
			shift = keyboard.nextInt();
			p1.setShift(shift);
		}
		
		System.out.println("Enter the pay rate for the Production Worker: ");
		p1.setPayRate(keyboard.nextDouble());
		
		
		System.out.println("Employee Name: " + e1.getName());
		System.out.println("Employee Number: " + e1.getEmployeeNum());
		System.out.println("Emloyee Hire Date: " + e1.getHireDate());
		System.out.println("Production Worker Name: " + p1.getName());
		System.out.println("Production Worker Number: " + p1.getEmployeeNum());
		System.out.println("Production Worker Hire Date: " + p1.getHireDate());
		System.out.println("Production Worker Shift: " + p1.getShift());
		System.out.println("Production Worker Pay Rate: " + d1.format(p1.getPayRate()));
		
		
		
		}

		
	}
