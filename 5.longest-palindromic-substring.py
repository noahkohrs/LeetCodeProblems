#
# @lc app=leetcode id=5 lang=python3
#
# [5] Longest Palindromic Substring
#

# @lc code=start
class Solution:
    def longestPalindrome(self, s: str) -> str:
            
            def expandAroundCenter(s : str, left : int , right : int) -> int:
                while left >= 0 and right < len(s) and s[left] == s[right]:
                    left -=1
                    right +=1
                return right - left - 1
    
            start = 0
            end = 0
            for i in range(len(s)):
                # Odd Cases 
                len1 = expandAroundCenter(s, i, i)
                # Even Cases
                len2 = expandAroundCenter(s, i, i+1)
                length = max(len1, len2)
                if length > (end - start):
                    start = i - (length - 1) // 2
                    end = i + length // 2
            return s[start:end+1]
# @lc code=end

