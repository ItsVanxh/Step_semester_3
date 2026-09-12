package Week3.AssignmentProblems;

public class EmployeeCompanyInfo {
    private String empName;
    private double salary;

   
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    public EmployeeCompanyInfo(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    public static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        EmployeeCompanyInfo e1 = new EmployeeCompanyInfo("Ravi", 45000);
        EmployeeCompanyInfo e2 = new EmployeeCompanyInfo("Meera", 55000);
        EmployeeCompanyInfo e3 = new EmployeeCompanyInfo("Karthik", 60000);

        EmployeeCompanyInfo.printCompanyInfo();
    }
}