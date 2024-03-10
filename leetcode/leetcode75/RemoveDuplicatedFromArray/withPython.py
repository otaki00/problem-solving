# Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

# Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

# Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
# Return k.




def removeDuplicated(nums):
    # use three pointers to keep track of the array
    i = 0
    j = i+1
    k=0
    
    # loop through the array 
    while (j < len(nums)):
        print(i, j, k)
        #  nums[i] less than nums[j] then its in the right place AND theres no duplicates
        if nums[i] < nums[j]:
            # increment i and j
            i+=1
            j+=1
            # increment k
            k+=1
        # if nums[i] is equal to nums[j] then we have a duplicate
        elif nums[i] == nums[j]:
            # check if j is the last element in the array
            if j == len(nums)-1:
                # if it is then we need to swap the last element with the duplicate
                nums[i], nums[j] = nums[j], nums[i]
                # increment k
                k+=1
                # return k
                return k
            # increment j
            i+=1
        elif nums[i] > nums[j]:
            # that mean we reached the first non duplicated element after a duplicate, so we need to swap
            nums[i], nums[j] = nums[j], nums[i]
            # switch i and j
            temp = i+1
            i = j
            j = temp
            # increment k
            k+=1
    # return the number of unique elements
    return k

arr= [1,1,2,3,3,4,4,5]
print(len(arr))
print(removeDuplicated(arr))
print(arr)