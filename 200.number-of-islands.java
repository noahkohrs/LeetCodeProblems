/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution {
    public int numIslands(char[][] grid) {
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        int res = 0;
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[0].length; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    visit(i, j, grid, visited);
                    res++;
                }
            }
        }
        return res;
    }

    void visit(int x, int y, char[][] grid, boolean[][] visited) {
        if (tileExist(x, y, grid) && grid[x][y] == '1' && !visited[x][y]) {
            visited[x][y] = true;
            visit(x + 1, y, grid, visited);
            visit(x - 1, y, grid, visited);
            visit(x, y + 1, grid, visited);
            visit(x, y - 1, grid, visited);
        }
    }

    boolean tileExist(int x, int y, char[][] land) {
        return x >= 0 && x < land.length && y >= 0 && y < land[0].length;
    }

}
// @lc code=end
