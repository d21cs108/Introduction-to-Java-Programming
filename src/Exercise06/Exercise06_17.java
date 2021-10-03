package Exercise06;

/*
 *  @author Shubham Dankhara  (D21cs108)
 *  
 *  (Sort students) Write a program that prompts the user to enter the number of
 *   students, the students’ names, and their scores, and prints student names 
 *   in decreasing order of their scores.
 */
import java.util.Scanner;

public class Exercise06_17 {

	public static void main(String[] args) {
		// use for take value from user
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the number of students
		System.out.print("Enter the number of students: ");
		String[] students = new String[input.nextInt()];
		int[] scores = new int[students.length];

		// Prompt the user to enter each students' names and thier scores
		for (int i = 0; i < students.length; i++) {
			System.out.print("Enter the Student Name " + (i + 1) + ": ");
			students[i] = input.next();
			System.out.print("Enter the Student Score: ");
			scores[i] = input.nextInt();
		}
		// Display Name of student
		for (String name : students) {
			System.out.println(name);
		}

	}

}
