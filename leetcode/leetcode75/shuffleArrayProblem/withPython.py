# Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

# Return the array in the form [x1,y1,x2,y2,...,xn,yn].

# actualy this is simple problem can be solved with O(n/2)

# omar solution
def shuffle(nums, n):
        """
        :type nums: List[int]
        :type n: int
        :rtype: List[int]
        """
        result = []
        for i in range(n):
            result.append(nums[i])
            result.append(nums[i+n])
        return result

nums = [1,2,4,1,3,4,5,6]

print(shuffle(nums, 4))