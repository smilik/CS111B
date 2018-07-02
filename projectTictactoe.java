import java.util.Scanner;
public class projectTictactoe {
    public static void main(String []args){
        int numTurns = 9;
        Scanner userInput = new Scanner(System.in);
        String userChoice = "";

        TicTacToe game_1 = new TicTacToe();

        game_1.initializeGame();
        while (numTurns > 0) {
            game_1.playerMove(numTurns);
            numTurns--;
            numTurns = game_1.checkWinner(numTurns);
            if (numTurns == 0) {
                System.out.println("IT'S A TIE!");
            }
        }
    }
}
