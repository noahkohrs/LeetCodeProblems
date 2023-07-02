/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {
        for (int i = 0; i < n; i++) {
            x *= x;
        }
        return x;
    }
}
// @lc code=end

