/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start


class Solution {
    public int maxArea(int[] height) {
        int currentMax = 0 ;
        for (int i = 0 ; i < height.length ; i++) 
            for (int j = i+1 ; j < height.length ; j++) 
                currentMax = Math.max(currentMax, Math.min(height[i], height[j]) * (j - i));
        return currentMax;
    }
}
// @lc code=end

