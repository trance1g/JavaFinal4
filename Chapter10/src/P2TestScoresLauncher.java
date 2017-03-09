
public class P2TestScoresLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] scores = {56.0, -75.0, 99.0, 78.0};
		try
		{
			 P2TestScores t1 = new P2TestScores(scores);
		}
		catch(InvalidTestScore t)
		{
			System.out.println(t.getMessage());
		}

	}

}
