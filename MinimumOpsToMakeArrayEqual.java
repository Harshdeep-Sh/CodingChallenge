// // Day 42 - LeetCode Problem 1551:  Minimum Operations to Make Array Equal

public class MinimumOpsToMakeArrayEqual {
    public int minOperations(int n) {
        int ans=0;
        for(int i=0;i<n/2;i++){
            int x=(2 * i) + 1;
            ans+=n-x;
        }
        return ans;
    }
}
