package Week3.AssignmentProblems;

public class Employee {
    private String empId;
    private String empName;
    private double salary;
    private boolean isIntern;

    // Primary constructor for permanent employees
    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    // Overloaded constructor for interns, chaining via this(...)
    public Employee(String empId, String empName) {
        this(empId, empName, 0);
        this.isIntern = true;
    }

    public void printProfile() {
        System.out.println(empId + " | " + empName + " | Rs " + salary + " | Intern: " + isIntern);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("E-101", "Divya", 65000);
        Employee emp2 = new Employee("E-102", "Arjun");

        emp1.printProfile();
        emp2.printProfile();
    }
}