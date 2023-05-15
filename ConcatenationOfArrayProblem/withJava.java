
public static void main(String[] args) {

    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length *2];
        int n = nums.length * 2;
        for(int i =o ; i < nums.length; i++){
            result[i] = result[i+n] = nums[i];
        }
        return result;
    }
}