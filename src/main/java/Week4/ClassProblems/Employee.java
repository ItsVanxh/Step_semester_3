package Week4.ClassProblems;

public class Employee {
    private String empId;
    private double salary;

    // Resolving constructor clash using this[cite: 3]
    public Employee(String empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    // Resolving method parameter clash using this[cite: 3]
    public void raiseSalary(double salary) {
        this.salary += salary;
    }

    public static void main(String[] args) {
        Employee[] emps = {
            new Employee("E-101", 40000),
            new Employee("E-102", 55000),
            new Employee("E-103", 62000),
            new Employee("E-104", 48000)
        };

        for (Employee e : emps) {
            e.raiseSalary(5000); // Apply identical bonus amount[cite: 3]
            System.out.println(e.empId + " | Final Salary: Rs " + e.salary);
        }
    }
}