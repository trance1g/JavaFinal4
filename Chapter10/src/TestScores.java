
public class TestScores {
	private double average;
	private double total;
	
	public TestScores(double[] scores){
		//for loop that iterates for the length of the array and if any of the values are out of the range
		//of the if statement, then it throws the exception
		for(int i = 0; i < scores.length; i++){
			if(scores[i] < 0 || scores[i] > 100){
				throw new IllegalArgumentException("There is an invalid entry");
				
			}
			total += scores[i];
		}
	}
	
	public double calcAvg(){
		//method to caluclate average
		double average = total / 4.0;
		return average;
	}
}
