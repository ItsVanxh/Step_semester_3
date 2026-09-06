package week1.class_problems;

import java.util.Scanner;

public class ReverseCustomerName {
    public static String reverseCustomerName(String customerName) {
        char[] characters = customerName.toCharArray();
        char[] reversed = new char[characters.length];

        for (int i = 0; i < characters.length; i++) {
            reversed[i] = characters[characters.length - 1 - i];
        }

        return new String(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.println("Original Name: " + customerName);
        System.out.println("Reversed Name: " + reverseCustomerName(customerName));

        scanner.close();
    }
}
