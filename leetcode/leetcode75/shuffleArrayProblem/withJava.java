package shuffleArrayProblem;

// this from internet and more complex from previous code, but it deafet my code :) python is trash dude
public class withJava {
    public int[] shuffle(int[] nums, int n) {
        int i = 0;
        int j = n;
        int[] arr = new int[2 * n];
        int k = 0;
        while (i < n && j < 2 * n) {
            arr[k++] = nums[i++];
            arr[k++] = nums[j++];
        }
        return arr;
    }
}
