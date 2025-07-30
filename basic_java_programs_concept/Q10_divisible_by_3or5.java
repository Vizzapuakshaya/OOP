package basic_java_programs_concept;
import java.util.Scanner;

public class Q10_divisible_by_3or5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = s.nextInt();

	        if (num % 3 == 0 && num % 5 == 0) {
	            System.out.println(num + " is divisible by both 3 and 5.");
	        } else {
	            System.out.println(num + " is not divisible by both 3 and 5.");
	        }

	        s.close();

	}

}
