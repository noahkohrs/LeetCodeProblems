/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */

// @lc code=start
import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 4) {
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            int A = nums[i];
            int B = 0;
            int C = 0;
            int D = 0;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                B = nums[j];
                for (int k = j + 1; k < nums.length - 1; k++) {
                    C = nums[k];
                    for (int l = k + 1; l < nums.length; l++) {
                        D = nums[l];
                        if ((long)A + (long)B + (long)C + (long)D == (long)target) {
                            List<Integer> temp = new ArrayList<>();
                            temp.add(A);
                            temp.add(B);
                            temp.add(C);
                            temp.add(D);
                            if (!res.contains(temp)) {
                                res.add(temp);
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}
// @lc code=end
