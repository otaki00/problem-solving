# You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

# Find two lines that together with the x-axis form a container, such that the container contains the most water.

# Return the maximum amount of water a container can store.

# Notice that you may not slant the container.

# my solution is very bad, because i didn't think wisely
# it's bad because of time, the java solution is the best on it take O(n) 
# it's take o(n^2)

def maxArea(height):
        """
        :type height: List[int]
        :rtype: int
        """
        max_area = 0
        for left in range(len(height)):
            for right in range(left+1, len(height)):
                width = right - left 
                area = min(height[left],height[right]) * width
                if area > max_area :
                    max_area = area
        
        return max_area


height = [1,8,6,2,5,4,8,3,8]
print(maxArea(height))