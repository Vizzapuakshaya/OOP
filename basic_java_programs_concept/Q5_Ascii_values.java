package basic_java_programs_concept;
import java.util.Scanner;


public class Q5_Ascii_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter a character: ");
	        char ch = scanner.next().charAt(0);

	        
	        int asciiValue = (int) ch;

	        
	        System.out.println("You entered: " + ch);
	        System.out.println("ASCII value: " + asciiValue);

	        scanner.close();

	}

}
