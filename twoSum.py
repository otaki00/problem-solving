# Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

# You may assume that each input would have exactly one solution, and you may not use the same element twice.

# You can return the answer in any order.

# Example 1:

# Input: nums = [2,7,11,15], target = 9
# Output: [0,1]
# Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

# Greedy way:
# O(n^2)

def twosum(nums, target):
    i= 0 
    j = i+1
    
    while i < len(nums):
        if nums[i] + nums[j] == target:
            return [i,j]
            break
        
        elif j == len(nums)-1 :
            i+=1
            j = i+1
            
        else:
            j+=1
            
    
    return "not found !!"



# best solution:
# O(n)

def best_twoSum(nums, target):
    seen = {}
    for i, value in enumerate(nums):
        if target - value in seen:
            return [seen[target-value], i]
        seen[value] = i
    return "not found !!"

nums = [2,7,11,15,4,4,56,1,3,6,7,55,0]
target = 60
print(best_twoSum(nums, target))    
