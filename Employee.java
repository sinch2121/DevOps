public class Employee extends Person {
    private String empId;
    private double salary;

    public Employee(String name, String dateOfBirth, String empId, double salary) {
        super(name, dateOfBirth);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayPersonInfo();
        displayPersonAge();
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("John Smith", "15-04-1985", "E12345", 75000.0);
        employee.displayEmployeeDetails();
    }
}

