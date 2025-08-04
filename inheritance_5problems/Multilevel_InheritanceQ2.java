package inheritance_5problems;


	class Person {
	    String name;
	    int age;

	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}

	class Student extends Person {
	    String studentID;

	    Student(String name, int age, String studentID) {
	        super(name, age);
	        this.studentID = studentID;
	    }

	    @Override
	    void displayInfo() {
	        super.displayInfo();
	        System.out.println("Student ID: " + studentID);
	    }
	}

	class GraduateStudent extends Student {
	    String thesisTitle;

	    GraduateStudent(String name, int age, String studentID, String thesisTitle) {
	        super(name, age, studentID);
	        this.thesisTitle = thesisTitle;
	    }

	    void submitThesis() {
	        System.out.println(name + " has submitted the thesis titled: " + thesisTitle);
	    }
	}

	public class Multilevel_InheritanceQ2{
	    public static void main(String[] args) {
	        GraduateStudent gs = new GraduateStudent("Akshaya", 24, "STU123", "AI in Healthcare");
	        gs.displayInfo();
	        gs.submitThesis();
	    }
	}



