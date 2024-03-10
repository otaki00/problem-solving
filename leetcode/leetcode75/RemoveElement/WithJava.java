// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

// Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

// Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
// Return k.


// ************************************** something i had learned **************************************
// in-place algorithm -> means that you should not use extra space for another array.

package RemoveElement;

public class WithJava {
    
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums, 3));
        for(int i=0; i< nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    public static int removeElement(int[] nums, int val){
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
