package basic_java_programs_concept;
import java.util.Scanner;

public class Q7_average_using_single_expression {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = input.nextInt();
        System.out.print("Enter second number:");
        int b = input.nextInt();
        int addition =a+b;
        int subtraction=a-b;
        int multiplication=a*b;
        int quotient = b != 0 ? a / b : 0;
        int remainder = b != 0 ? a % b : 0;
        System.out.println("Result\n");
        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        if (b != 0) {
            System.out.println("Division = " + quotient);
            System.out.println("Modulus = " + remainder);
        } else {
            System.out.println("division and modulus are not applicable");
        }

        input.close();
    }
}

