package week1.assigment_problems;

import java.util.Scanner;

public class SeatDuplicationChecker {
    public static void checkDuplicateSeats(int[] seatNumbers) {
        boolean foundDuplicate = false;

        for (int i = 0; i < seatNumbers.length; i++) {
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (seatNumbers[k] == seatNumbers[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    foundDuplicate = true;
                    break;
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of seat assignments: ");
        int count = scanner.nextInt();
        int[] seatNumbers = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter seat number " + (i + 1) + ": ");
            seatNumbers[i] = scanner.nextInt();
        }

        checkDuplicateSeats(seatNumbers);
        scanner.close();
    }
}
