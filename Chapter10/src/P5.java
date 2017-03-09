
public class P5 {
	//private variables
	private String description;
	private int unitsOnHand;
	private double price;
	
	public P5(String description, int unitsOnHand, double price) throws P3RetailItemException{
		// TODO Auto-generated constructor stub
		this.description = description;
		this.unitsOnHand = unitsOnHand;
		this.price = price;
		
		//if statement that states if the units or price is less than zero if throws the exception
		if(unitsOnHand < 0){
			throw new P3RetailItemException();
		}
		
		if(price < 0){
			throw new P3RetailItemException();
		}
		
		
	}
	
	public void setDesc(String description){
		this.description = description;
	}
	
	public void setUnits(int unitsOnHand){
		this.unitsOnHand = unitsOnHand;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public String getDesc(){
		return description;
	}
	
	public int getUnits(){
		return unitsOnHand;
	}
	
	public double getPrice(){
		return price;
	}

}
