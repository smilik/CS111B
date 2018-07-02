import java.util.Scanner;
public class TicTacToe {
    private char selectX = 'X';
    private char selectO = 'O';
    private char[][] grid = new char[3][3];


    //Draw & update grid.
    public void createGrid() {
        System.out.println();
        System.out.printf(" %c | %c | %c \n", grid[0][0], grid[0][1], grid[0][2]);
        System.out.println("-----------");
        System.out.printf(" %c | %c | %c \n", grid[1][0], grid[1][1], grid[1][2]);
        System.out.println("-----------");
        System.out.printf(" %c | %c | %c \n", grid[2][0], grid[2][1], grid[2][2]);
        System.out.println();
    }

    //sets up the game
    public void initializeGame() {
        int counter = 1;

        System.out.println("Choose a number to place your choice.\nX goes first:");
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                char charCounter = (char) (counter + '0');
                grid[row][col] = charCounter;
                counter++;
            }
        }
        createGrid();
    }

    //player move
    public void playerMove(int a) {
        int player_1 = 1, player_2 = 0;
        int turn = a;

        Scanner userInput = new Scanner(System.in);

        if (turn % 2 == player_1) {
            System.out.println("X Turn.");
            System.out.print("Place your mark at: ");
            int userChoice = userInput.nextInt();
            //for comparing to the grid numbers
            char userChoiceChar = (char) (userChoice + '0');

            for (int row = 0; row < grid.length; row++) {
                for (int col = 0; col < grid[0].length; col++) {
                    if (grid[row][col] == userChoiceChar)
                        grid[row][col] = selectX;
                }
            }
        } else if (turn % 2 == player_2) {
            System.out.println("O Turn.");
            System.out.print("Place your mark at: ");
            int userChoice = userInput.nextInt();
            //for comparing to the grid numbers
            char userChoiceChar = (char) (userChoice + '0');

            for (int row = 0; row < grid.length; row++) {
                for (int col = 0; col < grid[0].length; col++) {
                    if (grid[row][col] == userChoiceChar)
                        grid[row][col] = selectO;
                }
            }
        }
        createGrid();
    }

    //winning conditions
    public int checkWinner(int a) {
        //check rows
            for (int col = 0; col < grid[0].length; col++) {
            if (selectX == grid[0][0] && selectX == grid[0][1] && selectX == grid[0][2] ||
                    selectX == grid[1][0] && selectX == grid[1][1] && selectX == grid[1][2] ||
                    selectX == grid[2][0] && selectX == grid[2][1] && selectX == grid[2][2]) {

                System.out.println("X HAS WON!");
                return -1;
            }else if (selectO == grid[0][0] && selectO == grid[0][1] && selectO == grid[0][2] ||
                    selectO == grid[1][0] && selectO == grid[1][1] && selectO == grid[1][2] ||
                    selectO == grid[2][0] && selectO == grid[2][1] && selectO == grid[2][2]) {

                System.out.println("O HAS WON!");
                return -1;
            }
        }
        // check col
        for(int row=0;row<grid.length;row++) {
            if (selectX == grid[0][0] && selectX == grid[1][0] && selectX == grid[2][0] ||
                    selectX == grid[0][1] && selectX == grid[1][1] && selectX == grid[2][1] ||
                    selectX == grid[0][2] && selectX == grid[1][2] && selectX == grid[2][2]) {

                System.out.println("X HAS WON!");
                return -1;
            }else if (selectO == grid[0][0] && selectO == grid[1][0] && selectO == grid[2][0] ||
                    selectO == grid[0][1] && selectO == grid[1][1] && selectO == grid[2][1] ||
                    selectO == grid[0][2] && selectO == grid[1][2] && selectO == grid[2][2]) {

                    System.out.println("O HAS WON!");
                    return -1;
            }
        }
        //check diagnals
        for(int col=0;col<grid[0].length;col++) {
            if (selectX == grid[0][0] && selectX == grid[1][1] && selectX == grid[2][2] ||
                    selectX == grid[2][0] && selectX == grid[1][1] && selectX == grid[0][2]) {
                System.out.println("X HAS WON!");
                return -1;
            }
            if (selectO == grid[0][0] && selectO == grid[1][1] && selectO == grid[2][2] ||
                    selectO == grid[2][0] && selectO == grid[1][1] && selectO == grid[0][2]) {
                System.out.println("O HAS WON!");
                return -1;
            }
        }


    return a;
    }








}