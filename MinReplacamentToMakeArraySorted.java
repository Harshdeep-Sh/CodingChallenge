// Day 64 - LeetCode Problem 2366: Minimum Replacements to Sort the Array

public class MinReplacamentToMakeArraySorted {
    public long minimumReplacement(int[] nums) {
        int last = nums[nums.length-1];
        long ans = 0;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]>last){
                int newEle = nums[i]/last;
                if(nums[i]%last!=0){
                    newEle++;
                }
                last = nums[i]/newEle;
                ans+=newEle-1;
            }
            else{
                last = nums[i];
            }
        }
        return ans;
    }
}
