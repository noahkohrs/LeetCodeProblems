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
        for (int i = 0; i < m.map.length; i++) {
            for (int j = 0; j < m.map[0].length; j++) {
                if (m.map[i][j].isLand() && !m.map[i][j].isVisited()) {
                    m.visit(i, j);
                    res++;
                }
            }
        }
        return res;
    }

    class Map {
        Tile[][] map;

        Map(char[][] grid) {
            map = new Tile[grid.length][grid[0].length];
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    map[i][j] = new Tile(grid[i][j] == '1');
                }
            }
        }

        void visit(int x, int y) {
            if (tileExist(x, y) && map[x][y].isLand() && !map[x][y].isVisited()) {
                map[x][y].visited = true;
                visit(x + 1, y);
                visit(x - 1, y);
                visit(x, y + 1);
                visit(x, y - 1);
            }
        }

        boolean tileExist(int x, int y) {
            return x >= 0 && x < map.length && y >= 0 && y < map[0].length;
        }

        class Tile {
            boolean visited;
            boolean land;

            Tile(boolean l) {
                visited = false;
                land = l;
            }

            boolean isVisited() {
                return visited;
            }

            boolean isLand() {
                return land;
            }
        }
    }
}
// @lc code=end
