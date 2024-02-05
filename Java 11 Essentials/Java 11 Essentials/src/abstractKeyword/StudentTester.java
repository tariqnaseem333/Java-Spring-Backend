package abstractKeyword;

public class StudentTester {
	
	public static void main(String[] args) {
		
		UnderGraduateStudent underGrad = new UnderGraduateStudent( "Mehul" );
		underGrad.setTestScore(0, 70);
		underGrad.setTestScore(1, 69);
		underGrad.setTestScore(2, 71);
		underGrad.setTestScore(3, 55);
		underGrad.generateResult();
		System.out.println("Name: " + underGrad.getName());
		System.out.println("Result: " + underGrad.getResult());
		System.out.println();
		
		GraduateStudent grad = new GraduateStudent( "Ajay" );
		grad.setTestScore(0, 70);
		grad.setTestScore(1, 69);
		grad.setTestScore(2, 71);
		grad.setTestScore(3, 55);
		grad.generateResult();
		System.out.println("Name: " + grad.getName());
		System.out.println("Result: " + grad.getResult());
		System.out.println();
		
	}

}
