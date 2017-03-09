
public class ShipLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate all of the ship classes
		Ship s1 = new Ship();
		CruiseShip c1 = new CruiseShip();
		CargoShip cs1 = new CargoShip();
		
		//using setters and toString to set the values of the fields
		s1.setName("Titanic");
		s1.setYear("1905");
		c1.setName("Carapathia");
		c1.setYear("1908");
		c1.setMaxPass(456);
		c1.toString();
		cs1.setName("Voyager");
		cs1.setYear("2008");
		cs1.setCargo(1250);
		cs1.toString();
		
		
		//displaying all output and toString to console
		System.out.println("Ship Name: " + s1.getName());
		System.out.println("Ship Year: " + s1.getYear());
		System.out.println("Ship Name: " + c1.getName());
		System.out.println("Ship Year" + c1.getYear());
		System.out.println("Ship Maximum Passengers: " + c1.toString());
		System.out.println("Ship Name: " + cs1.getName());
		System.out.println("Ship Year: " + cs1.getYear());
		System.out.println("Ship Cargo Capacity: " + cs1.toString());
		
		
	}

}
