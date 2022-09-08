package challenges;

public class RemoveDuplicatesFrom {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2}; //[1,2,_]
        final int i = removeDuplicates(nums);
        System.out.println(i);
    }

    public static int removeDuplicates(int[] nums) {
        int lastUnique = 0;
        int counter = 0;

        for(int i=0; i < nums.length; i++) {
            if(i < nums.length-1 && nums[i] == nums[i+1]) {
                continue;
            }
            nums[lastUnique] = nums[i];
            counter++;
        }
        return counter;
    }
}