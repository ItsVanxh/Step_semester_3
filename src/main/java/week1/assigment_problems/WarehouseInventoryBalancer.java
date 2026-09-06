package week1.assigment_problems;

import java.util.Scanner;

public class WarehouseInventoryBalancer {
    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0;
        int totalB = 0;
        int highestQuantity = sectionA[0];
        String highestSection = "A";
        int highestIndex = 0;

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            totalB += sectionB[i];

            if (sectionA[i] > highestQuantity) {
                highestQuantity = sectionA[i];
                highestSection = "A";
                highestIndex = i;
            }

            if (sectionB[i] > highestQuantity) {
                highestQuantity = sectionB[i];
                highestSection = "B";
                highestIndex = i;
            }
        }

        String status = totalA == totalB ? "Balanced" : "Not Balanced";
        System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB + " | Status: " + status);
        System.out.println("Highest Quantity: " + highestQuantity + " (Section " + highestSection + ", Item " + (highestIndex + 1) + ")");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of items in each section: ");
        int count = scanner.nextInt();
        int[] sectionA = new int[count];
        int[] sectionB = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter Section A quantity for item " + (i + 1) + ": ");
            sectionA[i] = scanner.nextInt();
        }

        for (int i = 0; i < count; i++) {
            System.out.print("Enter Section B quantity for item " + (i + 1) + ": ");
            sectionB[i] = scanner.nextInt();
        }

        if (count > 0) {
            analyzeInventory(sectionA, sectionB);
        } else {
            System.out.println("At least one item is required.");
        }

        scanner.close();
    }
}
