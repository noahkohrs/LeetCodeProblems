/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */
import java.util.Arrays;

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged_array = new int[nums1.length + nums2.length];
        for (int i=0 ; i<nums1.length ; i++) merged_array[i] = nums1[i];

        for (int i=0 ; i<nums2.length ; i++) merged_array[i+nums1.length] = nums2[i];
        
        Arrays.sort(merged_array);
        if (merged_array.length % 2 == 0) 
            return (merged_array[merged_array.length/2] + merged_array[merged_array.length/2-1]) / 2.0;
        
            return merged_array[merged_array.length/2];
    }
}
// @lc code=end

