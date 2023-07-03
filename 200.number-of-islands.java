/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution {
    public int numIslands(char[][] grid) {
        Map m = new Map(grid);
        int res = 0;
        for (int i = 0; i < m.visited.length; i++) {
            for (int j = 0; j < m.visited[0].length; j++) {
                if (m.land[i][j] && !m.visited[i][j]) {
                    m.visit(i, j);
                    res++;
                }
            }
        }
        return res;
    }

    class Map {
        boolean[][] land;
        boolean[][] visited;

        Map(char[][] grid) {
            land = new boolean[grid.length][grid[0].length];
            visited = new boolean[grid.length][grid[0].length];
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    land[i][j] = grid[i][j] == '1';
                }
            }
        }

        void visit(int x, int y) {
            if (tileExist(x, y) && land[x][y] && !visited[x][y]) {
                visited[x][y] = true;
                visit(x + 1, y);
                visit(x - 1, y);
                visit(x, y + 1);
                visit(x, y - 1);
            }
        }

        boolean tileExist(int x, int y) {
            return x >= 0 && x < land.length && y >= 0 && y < land[0].length;
        }
    }
}
// @lc code=end
