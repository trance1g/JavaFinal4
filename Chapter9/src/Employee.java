
public class Employee {
	private String name;
	private String employeeNum = "";
	private String hireDate;
	private int count = 0;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the employeeNum
	 */
	public String getEmployeeNum() {
		
		return employeeNum;
	}
	/**
	 * @param employeeNum the employeeNum to set
	 */
	public void setEmployeeNum(String employeeNum) {
		if(count==3){
			this.employeeNum = this.employeeNum + "-" + employeeNum;
		}else{
			this.employeeNum = this.employeeNum + employeeNum;
		}
		count++;
	}
	/**
	 * @return the hireDate
	 */
	public String getHireDate() {
		return hireDate;
	}
	/**
	 * @param hireDate the hireDate to set
	 */
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

}
