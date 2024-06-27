import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
    private String name;
    private LocalDate dateOfBirth;

    public Person(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public void displayPersonInfo() {
        System.out.println("Person Name: " + name);
    }

    public void displayPersonAge() {
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(dateOfBirth, currentDate).getYears();
        System.out.println("Person Age: " + age);
    }

    public static void main(String[] args) {
        Person person = new Person("Jane Doe", "25-12-1990");
        person.displayPersonInfo();
        person.displayPersonAge();
    }
}

