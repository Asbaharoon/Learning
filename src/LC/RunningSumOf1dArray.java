package LC;

//1480. Running Sum of 1d Array

public class RunningSumOf1dArray {
    /*class Solution {
    public int[] runningSum(int[] nums) {
        int [] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            int sum = 0;
            for (int j = 0; j <= i; j++){
                sum += nums[j];
            }
            result[i] = sum;
        }
        return result;
    }
}*/
/*class Solution {
    public int[] runningSum(int[] nums) {
        int [] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            result[i] = result[i-1] + nums[i];
        }
        return result;
    }
}*/
    //class Solution {
        public static int[] runningSum(int[] nums) {
            for (int i = 1; i < nums.length; i++) nums[i] += nums[i-1];
            return nums;
        }
    //}

    public static void main(String[] args) {
            int[] nums = {1,2,3,4,5};
        System.out.println(runningSum(nums));
    }
}
