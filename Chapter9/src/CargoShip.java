
public class CargoShip extends Ship{
	//private variables
	private int cargo;

	/**
	 * @return the cargo
	 */
	public int getCargo() {
		return cargo;
	}

	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CargoShip [cargo=" + cargo + "]";
	}
	
	

}
