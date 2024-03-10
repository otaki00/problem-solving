# Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

# Specifically, ans is the concatenation of two nums arrays.

# Return the array ans.

# to solve we need to loop through the arr twice, this will take O(2n) 


# omar solution
def getConcatenation(nums):
    followIndex = 0
    result = []
    followLoops = 0
    while(followLoops < 2):
        if(followIndex == len(nums)): 
            followIndex = 0
            followLoops += 1
        else:
            result.append(nums[followIndex])
            followIndex += 1
    
    return result


nums = [1,2,3,4]
print(getConcatenation(nums)) # result => [1, 2, 3, 4, 1, 2, 3, 4]


# internet solution 
def getConcatenation2(nums):
    n = len(nums)
    result = [0] * (n*2)
    
    for num in range(len(nums)):
        result[num] = result[num + n] = nums[num]
    
    return result


nums = [1,2,3,4]
print(getConcatenation2(nums)) # result => [1, 2, 3, 4, 1, 2, 3, 4]