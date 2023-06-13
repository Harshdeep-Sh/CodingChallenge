public class TriangularSumOfArray {
    public int[] helper(int[] nums){
        int[] arr = new int[nums.length-1];
        for(int i = 0;i<nums.length-1;i++){
            arr[i] = (nums[i]+nums[i+1])%10;
        }
        return arr;
    }
    public int triangularSum(int[] nums) {
        while(nums.length>1){
            nums = helper(nums);
        }
        return nums[0];
    }
}
