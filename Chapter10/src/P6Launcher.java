import java.util.Scanner;

public class P6Launcher {

	public static void main(String[] args) throws PayrollException{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		//input variables
		String inputName;
		String inputId;
		double inputRate;
		double inputHours;
		double grossPay;
		
		//get input
		System.out.println("What is your name? ");
		inputName = keyboard.nextLine();
		System.out.println("What is your ID Number? ");
		inputId = keyboard.nextLine();
		System.out.println("What is your pay rate? ");
		inputRate = keyboard.nextDouble();
		System.out.println("How many hours did you work? ");
		inputHours = keyboard.nextDouble();
		
		//show math
		grossPay = inputRate * inputHours;
		//instantiate object
		P6 employee1 = new P6(inputName, inputId, inputRate, inputHours);
		//show output
		
		//if else loops to throw exception based on invalid values
		if(inputName == ""){
			throw new PayrollException();
		} else if(inputId == ""){
			throw new PayrollException();
		}else if(inputHours < 0 || inputHours > 84){
			throw new PayrollException();
		}else{
			System.out.println("Name: " + employee1.getName());
			System.out.println("ID: " + employee1.getId());
			System.out.println("Pay Rate: " + employee1.getRate());
			System.out.println("Hours worked: " + employee1.getHours());
			System.out.println("Gross Pay: $" + grossPay);
		}
		
		
		
		
	}

}
