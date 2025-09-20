/*. E-Learning Platform
An online learning platform needs to support different types of courses.
Create an abstract class Course with:
Abstract method startCourse()
Abstract method endCourse()
Concrete method getCourseDetails().
Subclasses: ProgrammingCourse and LanguageCourse.
Question:
Why would you make startCourse() abstract instead of concrete?
If you add a method giveCertificate() that is same for all courses, where should it be placed?
Can you instantiate Course directly? Why/Why not?*/

package abstract_classes;
abstract class Course {
    protected String courseName;
    protected String instructor;

    public abstract void startCourse();
    public abstract void endCourse();

    public void getCourseDetails() {
        System.out.println("Course: " + courseName + ", Instructor: " + instructor);
    }

    public void giveCertificate(String studentName) {
        System.out.println("Certificate awarded to " + studentName +
                           " for completing " + courseName + " course.");
    }
}

class ProgrammingCourse extends Course {
    ProgrammingCourse(String name, String instructor) {
        this.courseName = name;
        this.instructor = instructor;
    }

    @Override
    public void startCourse() {
        System.out.println("Starting programming course: Setting up IDE and tools.");
    }

    @Override
    public void endCourse() {
        System.out.println("Ending programming course: Final coding project submitted.");
    }
}

class LanguageCourse extends Course {
    LanguageCourse(String name, String instructor) {
        this.courseName = name;
        this.instructor = instructor;
    }

    @Override
    public void startCourse() {
        System.out.println("Starting language course: Introduction to basic grammar.");
    }

    @Override
    public void endCourse() {
        System.out.println("Ending language course: Final oral test completed.");
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Course c1 = new ProgrammingCourse("Java Programming", "Dr. Sharma");
        Course c2 = new LanguageCourse("French Basics", "Ms. Marie");

        c1.getCourseDetails();
        c1.startCourse();
        c1.endCourse();
        c1.giveCertificate("Akshaya");

        System.out.println();

        c2.getCourseDetails();
        c2.startCourse();
        c2.endCourse();
        c2.giveCertificate("Ravi");
    }
}

