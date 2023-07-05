import java.util.ArrayList;
// Day 45 - LeetCode Problem 1493: Longest Subarray of 1's After Deleting One Element


public class Longest1sAfter1Deletion {
    public int longestSubarray(int[] nums) {
        ArrayList<Integer> arr=  new ArrayList<>();
        int count = 0;
        for(int i:nums){
            if(i==0){
                arr.add(count);
                count = 0;
            }
            else{
                count++;
            }
        }
        if(arr.size()==0){
            return nums.length-1; 
        }
        arr.add(count);
        int ans = 0;
        for(int i = 0;i<arr.size()-1;i++){
            if(arr.get(i)+arr.get(i+1)>ans){
                ans = arr.get(i)+arr.get(i+1);
            }
        }
        return ans;
    }
}
