package week1.class_problems;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equals("rock") && computerMove.equals("scissors")) ||
            (playerMove.equals("paper") && computerMove.equals("rock")) ||
            (playerMove.equals("scissors") && computerMove.equals("paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] moves = {"rock", "paper", "scissors"};

        System.out.print("Enter number of rounds: ");
        int rounds = scanner.nextInt();
        scanner.nextLine();

        String[] playerMoves = new String[rounds];
        String[] computerMoves = new String[rounds];
        String[] results = new String[rounds];
        int wins = 0;
        int losses = 0;
        int draws = 0;

        for (int i = 0; i < rounds; i++) {
            String playerMove;

            do {
                System.out.print("Enter your move for round " + (i + 1) + " (rock, paper, scissors): ");
                playerMove = scanner.nextLine().trim().toLowerCase();
            } while (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors"));

            String computerMove = moves[random.nextInt(moves.length)];
            String result = playRound(playerMove, computerMove);

            playerMoves[i] = playerMove;
            computerMoves[i] = computerMove;
            results[i] = result;

            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }

            System.out.println("Computer chose: " + computerMove);
            System.out.println(result);
        }

        System.out.println("\nRound\tPlayer Move\tComputer Move\tResult");
        for (int i = 0; i < rounds; i++) {
            System.out.println((i + 1) + "\t" + playerMoves[i] + "\t\t" + computerMoves[i] + "\t\t" + results[i]);
        }

        double winPercentage = rounds == 0 ? 0 : (wins * 100.0) / rounds;
        System.out.printf("%nWins: %d | Losses: %d | Draws: %d | Win %% = %.2f%%%n", wins, losses, draws, winPercentage);
        scanner.close();
    }
}
