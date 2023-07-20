// Day 55 - LeetCode Problem 735: Asteroid Collision

import java.util.Stack;

public class AsteroidCollision{
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> stk = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            if (stk.empty() || asteroids[i] > 0) {
                stk.push(asteroids[i]);
            } 
            else {
                while (!stk.empty() && stk.peek() > 0 && stk.peek() < Math.abs(asteroids[i])) {
                    stk.pop();
                }

                if (!stk.empty() && stk.peek() == Math.abs(asteroids[i])) {
                    stk.pop();
                } 
                else {
                    if (stk.empty() || stk.peek() < 0) {
                        stk.push(asteroids[i]);
                    }
                } 
            }
        }
        
        int[] ans = new int[stk.size()];
        int size = stk.size();
        while (!stk.empty()) {
            ans[--size] = stk.pop();
        }
        
        return ans;

    }
}