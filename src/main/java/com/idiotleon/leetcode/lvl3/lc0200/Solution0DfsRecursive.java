package com.idiotleon.leetcode.lvl3.lc0200;

import com.idiotleon.util.Constant;

/**
 * @author: Leon
 * <a href="https://leetcode.com/problems/number-of-islands/">LC0200</a>
 * <p>
 * Time Complexity:     O(`NR` * `NC`)
 * Space Complexity:    O(`NR` * `NC`)
 */
@SuppressWarnings(Constant.WARNING.UNUSED)
public class Solution0DfsRecursive {
    private static final int[] DIRS = {0, -1, 0, 1, 0};

    private static final char WATER = '0';
    private static final char LAND = '1';

    public int numIslands(char[][] grid) {
        int islands = 0;
        // sanity check, not required
        // if (grid == null || grid.length == 0)
        // return islands;

        final int NR = grid.length, NC = grid[0].length;

        for (int row = 0; row < NR; ++row) {
            for (int col = 0; col < NC; ++col) {
                if (grid[row][col] == LAND) {
                    ++islands;
                    dfs(row, col, grid);
                }
            }
        }

        return islands;
    }

    private void dfs(final int row, final int col, final char[][] grid) {
        final int NR = grid.length, NC = grid[0].length;
        if (row < 0 || col < 0 || row >= NR || col >= NC || grid[row][col] == WATER) {
            return;
        }

        grid[row][col] = WATER;

        for (int d = 0; d < 4; ++d) {
            final int nextRow = row + DIRS[d], nextCol = col + DIRS[d + 1];
            dfs(nextRow, nextCol, grid);
        }
    }
}