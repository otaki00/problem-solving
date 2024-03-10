// There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

// Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

// Note that multiple kids can have the greatest number of candies.

// Example 1:

// Input: candies = [2,3,5,1,3], extraCandies = 3
// Output: [true,true,true,false,true] 


package Kids_With_the_Greatest_Number_of_Candies;

import java.util.ArrayList;
import java.util.List;

public class WithJava {
    public static void main(String[] args) {
        
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        List<Boolean> result = kidsWithCandies(candies, extraCandies);

        System.out.println(result);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // first thing extract the max value from the array
        int max = 0;
        for(int i =0; i< candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }

        // now we have the max value, we can loop through the array and check if the value + extraCandies is greater than the max value
        List<Boolean> result = new ArrayList<Boolean>();

        for(int i =0; i< candies.length; i++){
            if(candies[i] + extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        
        return result;
    }
}
