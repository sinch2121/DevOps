import java.util.ArrayList;
import java.util.List;

public class Student1 {
    private String name;
    private String program;
    private int semester;
    private List<Course> courses;

    public Student1(String name, String program, int semester) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = new ArrayList<>();
    }

    public void registerCourse(Course course) {
        courses.add(course);
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Courses Registered: ");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }

    public void displayLowMarksCourses() {
        System.out.println("Courses with Marks Less Than 40:");
        for (Course course : courses) {
            if (course.getMarks() < 40) {
                System.out.println(course.getCourseName() + ": " + course.getMarks());
            }
        }
    }

    public static void main(String[] args) {
        Student1 student = new Student1("Alice Johnson", "Computer Science", 2);
        Course course1 = new Course("Data Structures", 45);
        Course course2 = new Course("Algorithms", 38);
        Course course3 = new Course("Operating Systems", 50);

        student.registerCourse(course1);
        student.registerCourse(course2);
        student.registerCourse(course3);

        student.displayStudentInfo();
        student.displayLowMarksCourses();
    }
}
