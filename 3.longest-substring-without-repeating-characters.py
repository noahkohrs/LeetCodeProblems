#
# @lc app=leetcode id=3 lang=python3
#
# [3] Longest Substring Without Repeating Characters
#

# @lc code=start
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        longestStr = 0
        for i in range(len(s)):
            currStr = s[i]
            for j in range(i+1, len(s)):
                if s[j] not in currStr:
                    currStr += s[j]
                else:
                    break
            if len(currStr) > longestStr:
                longestStr = len(currStr)
            if len(currStr) > len(s) - i:
                break
        return longestStr

            
            
        
# @lc code=end

