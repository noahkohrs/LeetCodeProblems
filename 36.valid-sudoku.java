/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */

// @lc code=start
class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            if (!(checkColumn(board, i) && checkLine(board, i) && checkSquare(board, i)))
                return false;
        }
        return true;
    }

    private boolean checkSquare(char[][] board, int num) {
        Stack s = new Stack();
        int x_off = num / 3 * 3;
        int y_off = num % 3 * 3;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                if (!s.add(board[x_off+i][y_off+j])) {
                    return false;
                }
            }
        return true;
    }

    boolean checkColumn(char[][] board, int num) {
        Stack s = new Stack();
        for (int i = 0; i < 9; i++) {
            if (!s.add(board[num][i])) {
                return false;
            }
        }
        return true;
    }

    boolean checkLine(char[][] board, int num) {
        Stack s = new Stack();
        for (int i = 0; i < 9; i++) {
            if (!s.add(board[i][num])) {
                return false;
            }
        }
        return true;
    }

    class Stack {
        boolean[] stack;

        Stack() {
            stack = new boolean[9];
            for (int i = 0; i < 9; i++)
                stack[i] = false;
        }

        boolean add(char c) {
            if (c == '.')
                return true;
            int add = (c - '1');
            if (add < 0 || add >= stack.length) {
                return false;
            }
            if (!stack[add]) {
                stack[add] = true;
            } else {
                return false;
            }
            return true;
        }

        boolean check() {
            for (int i = 0; i < 0; i++)
                if (stack[i] == false)
                    return false;
            return true;
        }
    }

}

// @lc code=end
