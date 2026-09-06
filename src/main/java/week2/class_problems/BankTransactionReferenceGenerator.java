package week2.class_problems;

import java.util.Scanner;

public class BankTransactionReferenceGenerator {
    public static String normalizeReference(String raw) {
        String reference = raw.trim();

        if (reference.length() < 3) {
            return reference;
        }

        return reference.substring(0, 3).toUpperCase() + reference.substring(3);
    }

    public static String validateAndFormat(String reference) {
        if (reference.length() != 14) {
            return "Invalid: reference must be exactly 14 characters";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(reference.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }

        for (int i = 3; i < reference.length(); i++) {
            if (!Character.isDigit(reference.charAt(i))) {
                return "Invalid: reference body must be 11 digits";
            }
        }

        StringBuilder formattedReference = new StringBuilder();
        formattedReference.append("[").append(reference.substring(0, 3)).append("] DATE: ");
        formattedReference.append(reference.substring(3, 5)).append("/");
        formattedReference.append(reference.substring(5, 7)).append("/");
        formattedReference.append(reference.substring(7, 9)).append(" | SEQ: ");
        formattedReference.append(reference.substring(9));
        return formattedReference.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter transaction reference: ");
        String reference = normalizeReference(scanner.nextLine());
        System.out.println(validateAndFormat(reference));
        scanner.close();
    }
}
