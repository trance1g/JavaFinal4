
public class TeamLeader extends ProductionWorker {
	//private variables
	private double reqTraining;
	private double completeTraining;
	private double monthlyBonus;
	
	/**
	 * @return the monthlyBonus
	 */
	public double getMonthlyBonus() {
		return monthlyBonus;
	}
	/**
	 * @param monthlyBonus the monthlyBonus to set
	 */
	public void setMonthlyBonus(double monthlyBonus) {
		this.monthlyBonus = monthlyBonus;
	}
	/**
	 * @return the reqTraining
	 */
	public double getReqTraining() {
		return reqTraining;
	}
	/**
	 * @param reqTraining the reqTraining to set
	 */
	public void setReqTraining(double reqTraining) {
		this.reqTraining = reqTraining;
	}
	/**
	 * @return the completeTraining
	 */
	public double getCompleteTraining() {
		return completeTraining;
	}
	/**
	 * @param completeTraining the completeTraining to set
	 */
	public void setCompleteTraining(double completeTraining) {
		this.completeTraining = completeTraining;
	}
}
