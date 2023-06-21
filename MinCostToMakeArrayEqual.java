// day 33 - LeetCode Problem 2448: Minimum Cost to Make Array Equal
public class MinCostToMakeArrayEqual {
    public long helper(int[] nums, int[] cost, int val){
        long ans = 0L;
        for(int i = 0;i<nums.length;i++){
            ans+=1L*Math.abs(nums[i]-val)*cost[i];
        }
        return ans;
    }
    public long minCost(int[] nums, int[] cost) {
        long ans = 0;
        int left = nums[0];
        int right = nums[0];
        for(int i:nums){
            left = Math.min(left,i);
            right = Math.max(right,i);
        }
        while(left<right){
            int mid = (left+right)/2;
            long c1 = helper(nums,cost,mid);
            long c2 = helper(nums,cost,mid+1);
            if(c1>c2){
                left = mid+1;
                ans = c2;
            }
            else{
                right = mid;
                ans = c1;
            }
        }
        return ans;
        
    }
}
