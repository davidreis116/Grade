package entities;

public class Grade {
	

	public String name;
	public double first_grade;
	public double second_grade;
	public double tird_grade;
	
	
	public void nota () {
		
		if (first_grade + second_grade + tird_grade >= 60)
			System.out.printf("FINAL GRADE = %.2f PASS", first_grade + second_grade + tird_grade);
		
		else System.out.printf("FINAL GRADE = %.2f FAIL, MISSING %.2f POINTS", first_grade + second_grade + tird_grade, (first_grade + second_grade + tird_grade)-60 );
		
		
		
		
	}
	

}
