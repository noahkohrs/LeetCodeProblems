/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    int[] list = new int[46];
    public int climbStairs(int n) {
        list[1] = 1;
        list[2] = 2;
        list[3] = 3;
        return numberOfPaths(n);
    }
    int numberOfPaths(int n) {
        if (list[n] != 0) 
            return list[n];
        int ret = numberOfPaths(n-1) + numberOfPaths(n-2); 
        list[n] =  ret ;
        return ret ;
    }
}
// @lc code=end

