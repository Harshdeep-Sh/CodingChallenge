// day 28 - Leetcode Problem 162: Find Peak Element
public class PeakElement {
    public int findPeakElement(int[] nums) {
        if(nums.length==1 || nums[0]>nums[1]){
            return 0;
        }
        if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }

        for(int i = 1; i<=nums.length-2;i++){
            if(nums[i]>nums[i+1] && nums[i]>nums[i-1]){
                return i;
            }
        }
        return -1;
    }
}
