public class JumpGame1 {
    public boolean canJump(int[] nums) {
        int ans = 0;
        int curr=nums[0];
        int index=0;
        while(curr!=0 && index!=nums.length-1){
            curr--;
            index++;
            if(nums[index]>curr){
                ans++;
                curr = nums[index];
            }
        }
        if(index==nums.length-1){
            return true;
        }
        return false;
    }
}
