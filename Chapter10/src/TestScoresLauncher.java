
public class TestScoresLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an array and new object
		double[] scores = {56.0, -75.0, 99.0, 78.0}; 
		TestScores t1 = new TestScores(scores);
		
		System.out.println("Average: " + t1.calcAvg());

	}

}
