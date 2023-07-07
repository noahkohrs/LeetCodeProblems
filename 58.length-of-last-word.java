/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        if (strs.length == 0)
            return 0;
        return strs[strs.length - 1].length();
    }
}
// @lc code=end

