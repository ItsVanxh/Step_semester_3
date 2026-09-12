package Week4.ClassProblems;

public class SrmStudent {
    static String collegeName;
    static String academicYear;
    private String name;

    // Static block runs exactly once[cite: 3]
    static {
        collegeName = "SRM";
        academicYear = "2026-2027";
        System.out.println("College info loaded");
    }

    public SrmStudent(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        String[] names = {"Ravi", "Meera", "Karthik", "Divya", "Anitha"};
        
        // Creating multiple students in a loop[cite: 3]
        for (String name : names) {
            SrmStudent s = new SrmStudent(name);
            System.out.println("Student record created: " + name);
        }
    }
}