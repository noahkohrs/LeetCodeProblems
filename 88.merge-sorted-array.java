/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0 ;
        int j = 0 ;
        int[] res = new int[m+n];
        int k = 0 ;
        while (i < m || j < n) {
            if (i == m) {
                res[k] = nums2[j];
                j++;
            } else if (j == n) {
                res[k] = nums1[i];
                i++;
            } else {
                res[k] = Math.min(nums1[i], nums2[j]);
                if (nums1[i] < nums2[j])
                    i++;
                else
                    j++;
            }
            k++;
        }
        for (int l = 0 ; l < m+n ; l++)
            nums1[l] = res[l];
    }
}
// @lc code=end

