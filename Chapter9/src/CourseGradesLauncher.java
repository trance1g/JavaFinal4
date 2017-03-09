import java.util.*;
public class CourseGradesLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate scanner c\lass used for input
		Scanner k = new Scanner(System.in);
		
		//instantiate Course grades class
		CourseGrades c1 = new CourseGrades();
		
		//instantiate all classes for the test values
		GradedActivity g1 = new GradedActivity();
		PassFailExam p1 = new PassFailExam(50, 12, 75.0);
		Essay e1 = new Essay();
		FinalExam f1 = new FinalExam(50, 13);
		
		//setting the values that are set by using setters
		e1.setScore(84);
		g1.setScore(88);
		
		c1.setLab(g1);
		c1.setPassFailExam(p1);
		c1.setEssay(e1);
		c1.setFinalExam(f1);
		
		//display output be calling the toString
		System.out.println(c1);

	}

}
