
public class P6 {
	//variables
	private String name;
	private String Id;
	private double payRate;
	private double hours;
	public P6(String name, String Id, double payRate, double hours) {
		// TODO Auto-generated constructor stub
		//constructor
		this.name = name;
		this.Id = Id;
		this.payRate = payRate;
		this.hours = hours;
		
	}
	//getters and setters
	public void setName(String name){
		this.name = name;
	}
	
	public void setId(String Id){
		this.Id = Id;
	}
	
	public void setRate(double payRate){
		this.payRate = payRate;
	}

	public void setHours(double hours){
		this.hours = hours;
	}
	
	public String getName(){
		return name;
	
	}
	
	public String getId(){
		return Id;
	}
	
	public double getRate(){
		return payRate;
	}
	
	public double getHours(){
		return hours;
	}



}
