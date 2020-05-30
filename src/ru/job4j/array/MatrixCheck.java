package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        result=monoHorizontal(board);
        result=monoVertical(board);

        return result;
    }
    private static boolean monoHorizontal(char[][] board){
        boolean result = false;
        for (int i=0;i<board.length;i++) {
            int check=0;
            for (int j=0;j<board.length;j++) {
                if (board[i][j] =='X') {
                    check++;
                }
            }
            if (check==board.length) {
                result = true;
                break;
            }
        }
        return result;
    }
    private static boolean monoVertical(char[][] board){
        boolean result = false;
        for (int i=0;i<board.length;i++) {
            int check=0;
            for (int j=0;j<board.length;j++) {
                if (board[j][i] =='X') {
                    check++;
                }
            }
            if (check==board.length) {
                result = true;
                break;
            }
        }
        return result;
    }
}