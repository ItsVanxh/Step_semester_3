package week2.assigment_problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StopWordFilteredWordFrequencyReport {
    public static void printFilteredWordFrequency(String feedback) {
        String cleanedFeedback = feedback.toLowerCase();
        cleanedFeedback = cleanedFeedback.replace(".", "").replace(",", "").replace("!", "").replace("?", "").replace(";", "");
        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};
        String[] words = cleanedFeedback.split("\\s+");
        Map<String, Integer> frequencies = new HashMap<>();

        for (String word : words) {
            boolean isStopWord = false;

            for (String stopWord : stopWords) {
                if (word.equals(stopWord)) {
                    isStopWord = true;
                    break;
                }
            }

            if (!isStopWord && !word.isEmpty()) {
                frequencies.put(word, frequencies.getOrDefault(word, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(frequencies.entrySet());
        entries.sort((first, second) -> second.getValue().compareTo(first.getValue()));

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter feedback: ");
        printFilteredWordFrequency(scanner.nextLine());
        scanner.close();
    }
}
