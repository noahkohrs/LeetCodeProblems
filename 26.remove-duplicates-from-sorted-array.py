#
# @lc app=leetcode id=26 lang=python3
#
# [26] Remove Duplicates from Sorted Array
#

# @lc code=start
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        #Convert nums to a set to remove duplicates
        nums[:] = sorted(set(nums))
        return len(nums)
# @lc code=end

