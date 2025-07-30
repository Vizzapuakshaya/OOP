package basic_java_programs_concept;

import java.util.Scanner;

public class Q8_arithematic_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
	    
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        
       
       System.out.printf("Addition       : %d + %d = %d%n", num1, num2, num1 + num2);
       System.out.printf("Subtraction    : %d - %d = %d%n", num1, num2, num1 - num2);
       System.out.printf("Multiplication : %d * %d = %d%n", num1, num2, num1 * num2);
       System.out.printf("Division       : %d / %d = %d%n", num1, num2, num1 / num2);
       System.out.printf("Subtraction    : %d %% %d = %d%n", num1, num2, num1 % num2);
       
        



	}

}
