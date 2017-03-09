
public class CruiseShip extends Ship{
	//private variables
	private int maxPass;

	/**
	 * @return the maxPass
	 */
	public int getMaxPass() {
		return maxPass;
	}

	/**
	 * @param maxPass the maxPass to set
	 */
	public void setMaxPass(int maxPass) {
		this.maxPass = maxPass;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CruiseShip [maxPass=" + maxPass + "]";
	}
	

}
