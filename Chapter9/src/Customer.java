
public class Customer extends Person {
private String customerNum;
private boolean mailingList;
/**
 * @return the customerNum
 */
public String getCustomerNum() {
	return customerNum;
}
/**
 * @param customerNum the customerNum to set
 */
public void setCustomerNum(String customerNum) {
	this.customerNum = customerNum;
}
/**
 * @return the mailingList
 */
public boolean isMailingList() {
	return mailingList;
}
/**
 * @param mailingList the mailingList to set
 */
public void setMailingList(boolean mailingList) {
	this.mailingList = mailingList;
}
}
