/*
 * @lc app=leetcode id=859 lang=java
 *
 * [859] Buddy Strings
 */

// @lc code=start
class Solution {
    public boolean buddyStrings(String s, String goal) {
        char[] sArr = s.toCharArray();
        char[] goalArr = goal.toCharArray();
        int sLength = sArr.length;
        int gLength = goalArr.length;
        if (sLength != gLength) {
            return false;
        }
        if (s.equals(goal)) {
            int[] count = new int[26];
            for (char c : sArr) {
                count[c - 'a']++;
            }
            for (int c : count)
                if (c > 1)
                    return true;

            return false;
        } else {
            int first = -1;
            int second = -1;
            for (int i = 0; i < sLength; i++) {
                if (sArr[i] != goalArr[i]) {
                    if (first == -1) {
                        first = i;
                    } else if (second == -1) {
                        second = i;
                    } else {
                        return false;
                    }
                }
            }
            return (second != -1 && sArr[first] == goalArr[second] && sArr[second] == goalArr[first]);
        }
    }
}
// @lc code=end

