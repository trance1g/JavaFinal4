
public class EssayLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Essay e1 = new Essay();
		
		e1.setGrammar(25);
		e1.setSpelling(19);
		e1.setLength(18);
		e1.setContent(30);
		
		
		System.out.println("Grammar: " + e1.getGrammar());
		System.out.println("Spelling: " + e1.getSpelling());
		System.out.println("Length: " + e1.getLength());
		System.out.println("Content: " + e1.getContent());
		System.out.println("Total Points: " + e1.getTotal());
		
		
		e1.setScore(e1.getTotal());
		
		System.out.println("Letter Grade: " + e1.getGrade());

	}

}
