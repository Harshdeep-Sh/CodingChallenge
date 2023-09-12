// Day 72 - LeetCode Problem 1647 Minimum Deletions to Make Character Frequencies Unique

import java.util.HashMap;
import java.util.HashSet;

public class MinDeletionToMakeFreqUnique {
    public int minDeletions(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        int ans = 0;
        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(int i : hm.values()){
            while(i>0 && hs.contains(i)){
                i--;
                ans++;
            }
            hs.add(i);
        }
        return ans;
    }
}
