package challenges;

public class PivotIndex {

    public static void main(String[] args) {
        int[] nums = new int[]{1,7,3,6,5,6};
        final int i = pivotIndex(nums);
        System.out.println(i);
    }

    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;

        for(int i=0; i<nums.length; i++) {
            rightSum += nums[i];
        }

        for(int i=0; i<nums.length; i++) {
            rightSum -= nums[i];
            if(rightSum == leftSum) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}