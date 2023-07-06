/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length);
        
    }
    int binarySearch(int nums[], int target, int start, int end) {
        if (start == end)
            return start;
        
        int mid = (start + end) / 2;
        if (nums[mid] == target)
            return mid;
        else if (nums[mid] > target)
            return binarySearch(nums, target, start, mid);
        else
            return binarySearch(nums, target, mid + 1, end);
    }
}
// @lc code=end

