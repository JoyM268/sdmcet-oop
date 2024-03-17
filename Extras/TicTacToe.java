//Program to implement a tic tac toe game
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = ' ';           
            }
        }

        Scanner sc = new Scanner(System.in);
        char player = 'X';
        boolean gameOver = false;
        int turnCount = 0;
        boolean win = false;
        while(!gameOver){
            printBoard(board);
            System.out.print("Player " + player + " enter: ");
            int i = sc.nextInt();
            int j = sc.nextInt();
            if(i > 2 || j > 2 || board[i][j] != ' '){
                System.out.println("Invalid position");
            }else{
                turnCount++;
                board[i][j] = player;
                win = check(board);
                if(win == true || turnCount == 9){
                    gameOver = true;
                } 
                player = (player == 'X')? 'O' : 'X';    
            }
        }
        
        printBoard(board);
        if(win == true){
            System.out.println("The winner is player " + ((player == 'X')? 'O' : 'X'));
        } else{
            System.out.println("The game was a draw");
        }
        sc.close();
    }

    private static void printBoard(char[][] board){
        for(int i = 0; i < 3; i ++){
            for(int j = 0; j < 3; j++){
                System.out.print(board[i][j]);
                if(j != 2){
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }

    private static boolean check(char[][] board){
        
        for(int i = 0; i < 3; i++){
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' '){
                return true;
            }
        }

        for(int i = 0; i < 3; i++){
            if(board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' '){
                return true;
            }
        }

        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' '){
            return true;
        }

        if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' '){
            return true;
        }

        return false;
    }
}