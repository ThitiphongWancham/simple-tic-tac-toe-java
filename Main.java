import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // an array to store each of those moves
        char[][] turn = new char[3][3];
        // initialize the array with ' '
        Arrays.fill(turn[0], ' ');
        Arrays.fill(turn[1], ' ');
        Arrays.fill(turn[2], ' ');
        // variables for tracking the game state
        char[] players = {'X', 'O'};
        int currentPlayer = 0;
        boolean isOver = false;

        // display the empty field
        printField(turn);

        while (!isOver) {
            // get the next move and print the field
            getNextMove(turn, scanner, players, currentPlayer);
            printField(turn);

            currentPlayer++;

            char winner = findWinner(turn);

            if (winner == 'D') {
                isOver = true;
                System.out.println("Draw");
            } else if (winner != 'N' && winner != ' ') {
                isOver = true;
                System.out.println(winner + " wins");
            }
        }
    }

    public static void printField(char[][] turn) {
        System.out.println("---------");
        System.out.println("| " + turn[0][0] + " " + turn[0][1] + " " + turn[0][2] + " |");
        System.out.println("| " + turn[1][0] + " " + turn[1][1] + " " + turn[1][2] + " |");
        System.out.println("| " + turn[2][0] + " " + turn[2][1] + " " + turn[2][2] + " |");
        System.out.println("---------");
    }

    public static void getNextMove(char[][] turn, Scanner scanner, char[] players, int currentPlayer) {
        boolean isPlaced = false;

        while (!isPlaced) {
            try {
                int i = scanner.nextInt() - 1;
                int j = scanner.nextInt() - 1;

                if (turn[i][j] == ' ') {
                    turn[i][j] = players[currentPlayer % 2];
                    isPlaced = true;
                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                }
            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Coordinates should be from 1 to 3!");
            }
        }
    }

    public static char findWinner(char[][] turn) {
        int countEmptySlot = 0;

        // straight-line cases (exclude diagonal cases)
        for (int i = 0; i < 3; i++) {
            if (turn[i][0] == turn[i][1] && turn[i][1] == turn[i][2]) {
                return turn[i][0];
            } else if (turn[0][i] == turn[1][i] && turn[1][i] == turn[2][i]) {
                return turn[0][i];
            }
        }

        // diagonal cases
        boolean diagonalWin =
                turn[0][0] == turn[1][1] && turn[1][1] == turn[2][2] ||
                        turn[0][2] == turn[1][1] && turn[1][1] == turn[2][0];
        if (diagonalWin) return turn[1][1];

        // count empty slots
        for (char[] charArray : turn) {
            for (char slot : charArray) {
                if (slot == ' ') countEmptySlot++;
            }
        }

        // 'D' is 'Draw', and 'N' is 'None'
        return countEmptySlot == 0 ? 'D' : 'N';
    }
}
