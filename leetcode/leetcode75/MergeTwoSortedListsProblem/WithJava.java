package MergeTwoSortedListsProblem;

// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.



public class WithJava {
    public static void main(String[] args) {
        int[] nums1 = {1,3,4,5,0,0,0}, nums2 = {2,3,6};
        merge(nums1, 4, nums2,3);
        for (int i : nums1) {
            System.out.println(i);
        }
    }

    // on this problem we gonna merge two lists, hmmm i can imagine that we can
    // assign two pointers one at the first of first list, and other at first of second list
    // then compare the elements and insert them, but this will make a problem that is shift elements 
    // we can shift elements by m+1 each step
    // time => O(m)
    // space => O(1)

    // this my solution, but will not work for this case, so after searchs i will improve it
    // public static void merge(int[] nums1, int m, int[] nums2, int n) {
    //     // validate the lengths
    //     if(n == 0 ) {
    //         return;
    //     }
    //     // set pointer at the first of each list
    //     int pointerForNums1=0,pointerForNums2=0;

    //     // loop until reachs the end of list one (because its the length for both)
    //     while (pointerForNums1 < nums1.length && pointerForNums2 < nums2.length) { 

    //         // check if we finish the list one elements, if not go
    //         if(pointerForNums1 < m  ) {
    //             // if element at list one that the pointer at is less than the other
    //             if (nums1[pointerForNums1] <= nums2[pointerForNums2]) {
    //                 // then move pointer at list one by one
    //                 pointerForNums1++;
    //             // else if the other is bigger, then
    //             }else {
    //                 // move the element the pointer in the list one at by m (at the the first zero after the last element of list one)
    //                 nums1[m] = nums1[pointerForNums1];
    //                 // then set the value from nums2 at the rigth place in nums1
    //                 nums1[pointerForNums1] = nums2[pointerForNums2];
    //                 // move pointers by one
    //                 pointerForNums1++;
    //                 pointerForNums2++;
    //                 // this means that one element is added 
    //                 m++;
    //             }
    //         // if we reach last element in nums1, then continue add the rest of nums2 at nums1
    //         }else {
    //             nums1[pointerForNums1] = nums2[pointerForNums2];
    //             pointerForNums1++;
    //             pointerForNums2++;
    //         }
    //     }
    // }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // this for track the elements from the end of each list
        int pointerAtNums1 = m-1;
        int pointerAtNums2 = n-1;

        // this pointer for track the index that will insert the element at, in firsr list
        int indexToInsert = m+n-1;

        while(pointerAtNums2 >= 0){
            if(pointerAtNums1 >=0 && nums1[pointerAtNums1] > nums2[pointerAtNums2]) {
                nums1[indexToInsert] = nums1[pointerAtNums1];
                pointerAtNums1--;
            }else{
                nums1[indexToInsert] = nums2[pointerAtNums2];
                pointerAtNums2--;
            }
            indexToInsert--;
        }

    }

}

