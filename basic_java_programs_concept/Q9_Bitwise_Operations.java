package basic_java_programs_concept;
import java.util.Scanner;

public class Q9_Bitwise_Operations {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		         Scanner input = new Scanner(System.in);
		            System.out.print("Enter first number:");
		         int a = input.nextInt();
		         System.out.print("Enter second number:");
		         int b = input.nextInt();
		         int and = a & b;
		         int or = a | b;
		         int xor = a ^ b;
		         int leftShift = a << 1;
		         int rightShift = a >> 1;
		         System.out.println("\nResult");
		         System.out.printf("a= %d\t\tBinary: %s\n", a, Integer.toBinaryString(a));
		         System.out.printf("b= %d\t\tBinary: %s\n", b, Integer.toBinaryString(b));
		         System.out.printf("a & b= %d\t\tBinary: %s\n", and, Integer.toBinaryString(and));
		         System.out.printf("a | b= %d\t\tBinary: %s\n", or, Integer.toBinaryString(or));
		         System.out.printf("a ^ b= %d\t\tBinary: %s\n", xor, Integer.toBinaryString(xor));
		         System.out.printf("a << 1= %d\tBinary: %s\n", leftShift, Integer.toBinaryString(leftShift));
		         System.out.printf("a >> 1= %d\tBinary: %s\n", rightShift, Integer.toBinaryString(rightShift));

	}
}
		     
		 

	


