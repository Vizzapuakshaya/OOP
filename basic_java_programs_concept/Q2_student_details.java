package basic_java_programs_concept;

import java.util.Scanner;

public class Q2_student_details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sc.next();
		
		System.out.println("Enter your rollno");
		int rollno = sc.nextInt();
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		System.out.println("Enter your  gender M/F");
		String gender = sc.next();
		
		System.out.println("Enter your percentage");
		double percentage = sc.nextDouble();
		
		 System.out.println("\n--- Student Details ---");
	        System.out.printf("Name       : %s\n", name);
	        System.out.printf("Roll No    : %d\n", rollno);
	        System.out.printf("Age        : %d\n", age);
	        System.out.printf("Gender     : %s\n", gender);
	        System.out.printf("Percentage : %.2f%%\n", percentage);

	
	}

}
