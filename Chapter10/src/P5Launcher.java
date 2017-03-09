import java.util.Scanner;

public class P5Launcher {

	public static void main(String[] args) throws P3RetailItemException {
		// TODO Auto-generated method stub
		//instantiate scanner class
		Scanner keyboard = new Scanner(System.in);
		
		//local variables
		String inputName;
		int inputUnits;
		double inputPrice;
		
		//instantiate 3 new p5 objects
		P5 item1 = new P5("Item #1:    Jacket", 12, -59.95);
		P5 item2 = new P5("Item #2:    Designer Jeans", 40, 34.95);
		P5 item3 = new P5("Item #3:    Shirt", 20, 24.95);
		
		//try catch block for the price or units being out of the range thats accepted
		try
		{
			P5 obj1 = new P5("Item #1:    Jacket", -12, 59.95);
		}catch(P3RetailItemException t)
		{
			System.out.println(t.getMessage());
		}

		//display output
		System.out.println("Description                        Units on Hand                        Price");
		System.out.println(item1.getDesc() + "                       " + item1.getUnits() + "                              " + item1.getPrice());
		
		System.out.println();
		System.out.println(item2.getDesc() + "               " + item2.getUnits() + "                              " + item2.getPrice());
		
		System.out.println();
		System.out.println(item3.getDesc() + "                        " + item3.getUnits() + "                              " + item3.getPrice());
	}

}
