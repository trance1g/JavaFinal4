
public class P2TestScores {
	private double average;
	private double total;
	InvalidTestScore i1 = new InvalidTestScore();
	
	public P2TestScores(double[] scores) throws InvalidTestScore{
		for(int i = 0; i < scores.length; i++){
			if(scores[i] < 0 || scores[i] > 100){
				throw new InvalidTestScore(scores[i]);
				
			}
			total += scores[i];
		}
	}
	
	public double calcAvg(){
		
		double average = total / 4.0;
		return average;
	}
}
