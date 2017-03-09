
public class CourseGrades implements Analyzable{
	
	//private array with 4 elements
	private GradedActivity[] grades = new GradedActivity[4];

	//using the setters to assign the positions of the arrays to the following values
	public void setLab(GradedActivity g1){
		grades[0] = g1;
	}
	
	public void setPassFailExam(PassFailExam p1){
		grades[1] = p1;
	}
	
	public void setEssay(Essay e1){
		grades[2] = e1;
	}
	
	public void setFinalExam(FinalExam f1){
		grades[3] = f1;
	}
	
	//toString method to format the output
	public String toString(){
		return "Lab Score: " + String.format("%,.2f%%",grades[0].getScore()) + 
				"\nPass Fail Exam: " + String.format("%,.2f%%",grades[1].getScore()) + 
				"\nEssay: " + String.format("%,.2f%%",grades[2].getScore()) + 
				"\nFinal Exam: " + String.format("%,.2f%%",grades[3].getScore()) +
				"\nAverage Score: " + String.format("%,.2f%%",getAverage()) +
				"\nHighest Score: " + String.format("%,.2f%%",getHighest().getScore()) +
				"\nLowest Score: " + String.format("%,.2f%%",getLowest().getScore());
				
		
	}
	
	//method used to calculate the average grade score
	@Override
	public double getAverage() {
		double avg = 0;
		for(int i = 0;i < grades.length;i++){
		avg += grades[i].getScore();
		}
		avg = avg / grades.length;
		return avg;
	}

	//method used to find the highest value in the array
	@Override
	public GradedActivity getHighest() {
		double high = grades[0].getScore();
		int temp = 0;
		for(int i = 0;i < grades.length;i++){
			if(grades[i].getScore() > high){
				temp = i;
			}
			
		}
		return grades[temp];
	}

	//method used to find the lowest value in the array
	@Override
	public GradedActivity getLowest() {
		double low = grades[0].getScore();
		int temp = 0;
		for(int i = 0;i < grades.length;i++){
			if(grades[i].getScore() < low){
				temp = i;
			}
			
		}
		return grades[temp];
	}
}
