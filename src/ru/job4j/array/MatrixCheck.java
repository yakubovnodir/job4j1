package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if(board[i][i]=='X' && (monoHorizontal(board, i) || monoVertical(board, i))) {
                result=true;
                break;
            }
        }
        return result;
    }
    private static boolean monoHorizontal(char[][] board, int i){
        boolean result = false;
        int check = 0;
        for (int j = 0; j < board.length; j++) {
            if (board[i][j] == 'X') {
                check++;
            }
        }
        if (check == board.length) {
            result = true;
        }
        return result;
    }
    private static boolean monoVertical(char[][] board, int j){
        boolean result = false;
        int check = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][j] =='X') {
                check++;
            }
        }
        if (check==board.length) {
            result = true;
        }
        return result;
    }
}