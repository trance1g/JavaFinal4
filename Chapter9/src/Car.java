
public class Car extends Automobile implements Move{
	
	public Car(){
		System.out.println("A new car has been created!");
	}
	
	public Car(String vehicleType){
		System.out.println("A new " + vehicleType + " has been created.");
	}

	@Override
	public void addFuel(double gallons) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Automobile Move() {
		// TODO Auto-generated method stub
		return null;
	}

}
