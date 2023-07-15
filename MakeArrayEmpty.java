//Day 51 - LeetCode Problem 2659: Make Array Empty

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MakeArrayEmpty {
    public long countOperationsToEmptyArray(int[] nums) {
        Map<Integer, Integer> initial_pos = new HashMap<>();
        long n = nums.length;
        long ans = n;
        for (int i = 0; i < n; ++i)
            initial_pos.put(nums[i], i);

        Arrays.sort(nums);

        for (int i = 1; i < n; ++i)
            if (initial_pos.get(nums[i]) < initial_pos.get(nums[i - 1]))
                ans += n - i;

        return ans;
    }
}
