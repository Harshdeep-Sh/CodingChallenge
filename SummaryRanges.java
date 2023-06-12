import java.util.ArrayList;
import java.util.List;
// day 24 - Leetcode Problem 228: Summary Ranges
public class SummaryRanges {
        public List<String> summaryRanges(int[] nums) {
        if(nums==null || nums.length==0){
            return new ArrayList<>();
        }

        List<String> arr = new ArrayList<>();
        int init = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]+1){
                if(init==nums[i-1]){
                    arr.add(Integer.toString(init));
                }
                else{
                    arr.add(init+"->"+nums[i-1]);
                }
                init = nums[i];
            }
        }
        if(init==nums[nums.length-1]){
            arr.add(Integer.toString(init));
        }
        else{
            arr.add(init + "->" + nums[nums.length-1]);
        }
        return arr;
    }
}
