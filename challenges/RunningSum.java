package challenges;

import java.util.Arrays;

public class RunningSum {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        final int[] ints = runningSum(nums);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];

        int previousNumber = 0;

        for(int i=0; i<nums.length; i++) {
            final int newValue = previousNumber + nums[i];
            result[i] = newValue;
            previousNumber = newValue;
        }
        return result;
    }
}
