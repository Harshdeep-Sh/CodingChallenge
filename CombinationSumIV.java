
import java.util.Arrays;

public class CombinationSumIV {
    public int solve(int target,int[] nums,int[] arr){
        if(arr[target]!=-1){
            return arr[target];
        }
        if(0==target){
            return 1;
        }
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            if(target-nums[i]>=0){
                sum+=solve(target-nums[i],nums,arr);
            }
        }
        arr[target] = sum;
        return sum;
    }
    public int combinationSum4(int[] nums, int target) {
        int[] arr = new int[target+1];
        Arrays.fill(arr,-1);
        return solve(target,nums,arr);
    }
}
