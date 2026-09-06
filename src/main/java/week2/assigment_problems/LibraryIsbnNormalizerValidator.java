package week2.assigment_problems;

import java.util.Scanner;

public class LibraryIsbnNormalizerValidator {
    public static String normalizeCode(String raw) {
        String code = raw.trim();

        if (code.length() < 3) {
            return code;
        }

        return code.substring(0, 3).toUpperCase() + code.substring(3);
    }

    public static String validateAndFormat(String code) {
        if (code.length() != 13) {
            return "Invalid: code must be exactly 13 characters";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        for (int i = 3; i < code.length(); i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: code body must contain 10 digits";
            }
        }

        StringBuilder formattedCode = new StringBuilder();
        formattedCode.append("[").append(code.substring(0, 3)).append("] YEAR: ");
        formattedCode.append(code.substring(3, 7)).append(" | CATALOG: ");
        formattedCode.append(code.substring(7));
        return formattedCode.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ISBN-style code: ");
        String code = normalizeCode(scanner.nextLine());
        System.out.println(validateAndFormat(code));
        scanner.close();
    }
}
