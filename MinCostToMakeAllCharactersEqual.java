// day 27 - Leetcode Problem 2712: Minimum Cost to Make All Characters Equal

public class MinCostToMakeAllCharactersEqual {
    public long minimumCost(String s) {
        long cost = 0l;
        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                cost+=Math.min(i+1,s.length()-i-1);
            }
        }
        return cost;
    }
}
