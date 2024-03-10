
public class withJava {

    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length *2];
        int n = nums.length * 2;
        for(int i =0 ; i < nums.length; i++){
            result[i] = result[i+n] = nums[i];
        }
        return result;
    }
}