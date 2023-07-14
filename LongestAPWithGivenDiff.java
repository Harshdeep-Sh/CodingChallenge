// Day 50 - LeetCode Problem 1218: Longest Arithmetic Subsequence of Given Difference

import java.util.HashMap;
import java.util.Map;

public class LongestAPWithGivenDiff {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if (map.containsKey(ele - difference))
                map.put(ele, map.get(ele - difference) + 1);
            else
                map.put(ele, 1);
            count = Math.max(count, map.get(ele));
        }
        return count;
    }
}
