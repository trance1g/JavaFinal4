import java.util.*;
public class CustomerLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		Customer c1 = new Customer();
		
		
		c1.setName("Becky Rehmeier");
		c1.setAddress("1738 Hello Street.");
		c1.setTelephoneNum("314-123-4567");
		c1.setCustomerNum("00343");
		c1.setMailingList(true);
		
		System.out.println("Customer Name: " + c1.getName());
		System.out.println("Customer Address: " + c1.getAddress());
		System.out.println("Customer Phone Number: " + c1.getTelephoneNum());
		System.out.println("Customer Number: " + c1.getCustomerNum());
		
		if(c1.isMailingList() == true){
			System.out.println("Does this customer wish to be on the mailing list?: Yes");
		}else{
			System.out.println("Does this customer wish to be on the mailing list?: No");
		}

		
	}

}
