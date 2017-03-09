
public class Month {
	enum eMonth {filler, january, february, march, april, may, june, july, august, september, october, november, december}
	private int monthNumber;
	/**
	 * @return the monthNumber
	 */
	public int getMonthNumber() {
		return monthNumber;
	}
	/**
	 * @param monthNumber the monthNumber to set
	 */
	public void setMonthNumber(int monthNum) {
		this.monthNumber = 1;
		if(monthNum > 1 && monthNum < 13){
			this.monthNumber = monthNum;
		}
	}
	public String getMonthName(){
		return eMonth.values()[getMonthNumber()].name();
	}
	public Month() {
		this.setMonthNumber(1);
		
	}
	public Month(int monthNum) {
		if(monthNum > 1 && monthNum < 13){
			this.setMonthNumber(monthNum);
		}
	}
	public Month(String name) throws MonthException
	  {
	     if (name.equalsIgnoreCase("january"))
	        monthNumber = 1;
	     else if (name.equalsIgnoreCase("february"))
	        monthNumber = 2;
	     else if (name.equalsIgnoreCase("march"))
	        monthNumber = 3;
	     else if (name.equalsIgnoreCase("april"))
	        monthNumber = 4;
	     else if (name.equalsIgnoreCase("may"))
	        monthNumber = 5;
	     else if (name.equalsIgnoreCase("june"))
	        monthNumber = 6;
	     else if (name.equalsIgnoreCase("july"))
	        monthNumber = 7;
	     else if (name.equalsIgnoreCase("august"))
	        monthNumber = 8;
	     else if (name.equalsIgnoreCase("september"))
	        monthNumber = 9;
	     else if (name.equalsIgnoreCase("october"))
	        monthNumber = 10;
	     else if (name.equalsIgnoreCase("november"))
	        monthNumber = 11;
	     else if (name.equalsIgnoreCase("december"))
	        monthNumber = 12;
	     else
	     throw new MonthException();
	  }
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getMonthName();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Month other = (Month) obj;
		if (monthNumber != other.monthNumber)
			return false;
		return true;
	}
	
	public boolean greaterThan(Month m){
	
		if(this.monthNumber > m.monthNumber){
			return true;
		}else{
			return false;
		}
		
		
	}
	
	public boolean lessThan(Month m){
		if(this.monthNumber < m.monthNumber){
			return true;
		}else{
			return false;
		}
		
		
	}
	
	
	
	
}
