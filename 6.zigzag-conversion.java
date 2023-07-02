/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] Zigzag Conversion
 */

// @lc code=start

import java.util.*;

class Solution {
    public String convert(String s, int numRows) {
        ArrayList<String> strs= new ArrayList<String>();
        for (int i=0 ; i < numRows ; i++) {
            strs.add("");
        }
        int i=0;
        int incr = 1;
        for (char c : s.toCharArray()) {
            strs.set(i, strs.get(i)+c);
            if (i == numRows-1) incr = -1;
            else if (i == 0) incr = 1;
            if (numRows==1 || numRows==0) incr = 0;
            i += incr;
        }
        String res = "";
        for (String str : strs) {
            res += str;
        }
        return res;
    }
}
// @lc code=end

