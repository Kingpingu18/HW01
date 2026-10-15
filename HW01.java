import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get Player A's move
        System.out.print("Player A, enter R, P, or S: ");
        char playerA = input.next().charAt(0);
        playerA = Character.toUpperCase(playerA);

        if (playerA != 'R' && playerA != 'P' && playerA != 'S') {
            System.out.println("Error: Player A entered a Invalid move.");
            System.exit(0);
        }

        // Get Player B's move
        System.out.print("Player B, enter R, P, or S: ");
        char playerB = input.next().charAt(0);
        playerB = Character.toUpperCase(playerB);

        if (playerB != 'R' && playerB != 'P' && playerB != 'S') {
            System.out.println("Error: Player B entered a Invalid move.");
            System.exit(0);
        }

        // Determine the winner
        if (playerA == playerB) {
            System.out.println("It's a tie!");
        }
        else if (playerA == 'R' && playerB == 'S') {
            System.out.println("Rock breaks Scissors. Player A wins!");
        }
        else if (playerA == 'S' && playerB == 'P') {
            System.out.println("Scissors cuts Paper. Player A wins!");
        }
        else if (playerA == 'P' && playerB == 'R') {
            System.out.println("Paper covers Rock. Player A wins!");
        }
        else if (playerB == 'R' && playerA == 'S') {
            System.out.println("Rock breaks Scissors. Player B wins!");
        }
        else if (playerB == 'S' && playerA == 'P') {
            System.out.println("Scissors cuts Paper. Player B wins!");
        }
        else if (playerB == 'P' && playerA == 'R') {
            System.out.println("Paper covers Rock. Player B wins!");
        }

        input.close();
    }
}
