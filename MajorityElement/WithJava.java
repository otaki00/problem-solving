// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times.
// You may assume that the majority element always exists in the array.

// ---------------------------------------------------------------------------

// omar 
// we can say this is easy problem, there's several techniques we can use
// like : counting/radix array, or use hash map (key = number, value how many appears)
// but thos will take o(N) as time 
// O(N) as time is the lower limit, because we must itterat through all elements
// so i think use hash map will be the best way 
// the space will as the number of elements with out repeat
// as worst case it will be O(N), but we know from the problem that can't be happen


package MajorityElement;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class WithJava {
    
    public static int findMajorNumber(int[] numbers) {
        // lets initialize the set 
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();

        // loop through numbers array,
        // and if the element not in the hashMap add it and make value 1
        // else increase value by one 
        for(int i=0; i<numbers.length; i++) {
            // check if the number in the hashMap
            if(myMap.containsKey(numbers[i])) {
                // if yes add one to it's value
                int value = myMap.get(numbers[i]) ;
                value++;
                myMap.replace(numbers[i], value);
            }else {
                // if not, add to map and value is one 
                myMap.put(numbers[i], 1);
            }
        }

        //define max variable to check the maximum number of repeated 
        int max = 0 ;
        // to save the number that repeated most
        int num = numbers[0] ;

        // loop on the elements array, to check the vlaues in hashmap
        for(int i =0 ;i < numbers.length; i++ ){
            // chech if element is in map, and the value is bigger than max
            if(myMap.containsKey(numbers[i]) && myMap.get(numbers[i]) > max){
                num = numbers[i];
                max = myMap.get(numbers[i]);
            }
        }

        // return the max if it >= to half of list
        return max >= numbers.length/2 ? num : 0;
    }


    public static void main(String[] args) {
        
        int[] numbers = {1,3,3,5,3,4};
        System.out.println(findMajorNumber(numbers));
    }
}
