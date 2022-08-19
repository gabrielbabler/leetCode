package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CountHillValley {

    public static void main(String[] args) {
        CountHillValley countHillValley = new CountHillValley();

        int[] nums = new int[]{5,3,5,5,5};
        final int value = countHillValley.countHillValley(nums);
        System.out.println(value);
    }

    public int countHillValley(int[] nums) {
        int hillandvalley = 0;
        int prev = nums[0];

        for(int i=1; i<nums.length-1; i++){
            if(prev < nums[i] && nums[i] > nums[i+1] || prev > nums[i] && nums[i] < nums[i+1] ){
                prev = nums[i];
                hillandvalley++;
            }
        }

        return hillandvalley;
    }
}