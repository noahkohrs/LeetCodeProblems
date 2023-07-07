/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {1
        // Optimisation purpose
        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();
        if (needleArr.length == 0)
            return 0;
        if (haystackArr.length < needleArr.length)
            return -1;
        
        for (int i = 0 ; i < haystackArr.length - needleArr.length + 1; i++)
            if (arrayIndexCmp(haystackArr, i, needleArr))
                return i;
        return -1 ;
    }
    boolean arrayIndexCmp(char[] haystack, int start, char[] needle) {
        for (int i = 0; i < needle.length; i++)
            if (haystack[start + i] != needle[i])
                return false;
        
        return true;
    }
}
// @lc code=end

