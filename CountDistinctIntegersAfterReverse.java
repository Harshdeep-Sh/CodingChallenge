import java.util.HashSet;

public class CountDistinctIntegersAfterReverse {
    public int helper(int n){
        int ans = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            ans = ans*10 + rem;
        }
        return ans;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i:nums){
            hs.add(i);
            hs.add(helper(i));
        }
        return hs.size();
    }
}
