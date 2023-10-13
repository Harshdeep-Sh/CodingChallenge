// Day 76 - LeetCode Problem 746: Min Cost Climbing Stairs

import java.util.HashMap;

class MinCostClimbingStairs{
    HashMap<Integer,Integer> hm = new HashMap<>();
    public int solve(int[] cost,int ind){
        if(ind>=cost.length){
            return 0;
        }
        if(hm.getOrDefault(ind,-1)!=-1){
            return hm.get(ind);
        }
        int min = cost[ind] + Math.min(solve(cost,ind+1),solve(cost,ind+2));
        hm.put(ind,hm.getOrDefault(ind,0)+min);
        return min;
    }
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(solve(cost,1),solve(cost,0));
    }
}