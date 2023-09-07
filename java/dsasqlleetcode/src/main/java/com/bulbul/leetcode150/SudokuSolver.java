package com.bulbul.leetcode150;

public class SudokuSolver {

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(board.length);

        System.out.println(isValidSudoku(board));


    }

    public static boolean helper(char[][] board, int row, int col){
        int nrow = 0;
        int ncol = 0;

        if(col != board.length-1){
            nrow = row;
            ncol = col + 1;
        }else{
            nrow = row + 1;
            ncol = 0;
        }

        if(board[row][col] !='.'){
            if(helper(board,row,col)){
                return true;
            }
        }else{
            for(int i=1;i<9;i++){
//                if(isSafe(board,row,col,i)){
//                    board[row][col] = (char) (i+'0');
//                }
            }
        }

        return false;

    }

    public static boolean isValidSudoku(char[][] board) {
        helper(board,0,0);

        return false;
    }
}
