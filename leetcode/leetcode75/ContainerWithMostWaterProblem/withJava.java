package ContainerWithMostWaterProblem;

public class withJava {
    public int maxArea(int[] height) {
        /*
        in this solution, we follow Two Pointers Approach
        this means we put two pointers one at first and one at last of array 
        then we calculate the area and compare it with previous read 
        then we move foreward the poiter how has the smallest value beacuse we want the larggest area
        */
        int max_Area = 0;
        int left= 0;
        int right = height.length-1;
        while(left < right) {
            int width = right - left ;
            int minValue = Math.min(height[left], height[right]);
            int area = minValue * width;
            if(area > max_Area) max_Area = area;
            if(height[left] == minValue) left++;
            else right--; 
        }
        
        return max_Area;
        
    }
}
