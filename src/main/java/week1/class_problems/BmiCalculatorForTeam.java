package week1.class_problems;

import java.util.Scanner;

public class BmiCalculatorForTeam {
    public static String getBmiStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        }
        if (bmi < 25) {
            return "Normal";
        }
        if (bmi < 30) {
            return "Overweight";
        }
        return "Obese";
    }

    public static void printWellnessReport(double[] heights, double[] weights) {
        System.out.printf("%n%-10s %-12s %-12s %-10s %s%n", "Person", "Height (m)", "Weight (kg)", "BMI", "Status");

        for (int i = 0; i < heights.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            System.out.printf("%-10d %-12.2f %-12.2f %-10.2f %s%n", i + 1, heights[i], weights[i], bmi, getBmiStatus(bmi));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int people = scanner.nextInt();
        double[] heights = new double[people];
        double[] weights = new double[people];

        for (int i = 0; i < people; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Enter height in metres: ");
            heights[i] = scanner.nextDouble();
            System.out.print("Enter weight in kilograms: ");
            weights[i] = scanner.nextDouble();
        }

        printWellnessReport(heights, weights);
        scanner.close();
    }
}
