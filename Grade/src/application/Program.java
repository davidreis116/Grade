package application;

import java.io.NotActiveException;
import java.util.Scanner;
import entities.*;

public class Program {

	public static void main(String[] args) {
		
		Grade grade = new Grade ();
			
		Scanner sc = new Scanner (System.in);		
	
		
		System.out.println("Enter with the name: ");		
		grade.name = sc.nextLine();
		
		System.out.println("Enter with the grade from the 3 semesteres: ");		
		grade.first_grade = sc.nextDouble();
		grade.second_grade = sc.nextDouble();
		grade.tird_grade = sc.nextDouble();
		
		grade.nota();
			
		sc.close();

	}

}
