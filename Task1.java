package practical;
import java.util.*;
class Student{
	String name;
	int Rollno;
	int marks;
	
	void setter(String name, int Rollno, int marks)
	{
		this.name = name;
		this.Rollno = Rollno;
		this.marks = marks;
	}
	
	void getter()
	{
		System.out.println("Name of the Student: " + name);
		System.out.println("Rollno of the Student: " +Rollno);
		System.out.println("marks of the Student: " +marks);
		
	}
}
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of Student: ");
		String name = sc.next();
		System.out.println("Enter Rollno of Student: ");
		int Rollno = sc.nextInt();
		System.out.println("Enter Marks of Student: ");
		int marks = sc.nextInt();

		Student st = new Student();
		st.setter(name,Rollno,marks);
		st.getter();
		sc.close();
	}

}
