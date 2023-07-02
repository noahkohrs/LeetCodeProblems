#
# @lc app=leetcode id=18 lang=python3
#
# [18] 4Sum
#

# @lc code=start
class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        set = {}
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                for k in range(j+1,len(nums)):
                    for l in range(k+1,len(nums)):
                        if Solution.eval(nums,i,j,k,l,target):
                            set.append([nums[i],nums[j],nums[k],nums[l]])
        ret = []
        ret[:] = [x for x in set if x not in ret]
        return ret
    def eval(nums : List[int], i : int,j : int ,k : int ,l : int, target : int) -> bool :
        return nums[i] + nums[j] + nums[k] + nums[l] == target
# @lc code=end

