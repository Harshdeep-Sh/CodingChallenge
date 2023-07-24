// Day 59 - LeetCode Problem 650: 2 Keys Keyboard


public class TwoKeysKeyboard {
    public int maxPrime(int n){
        int res = n;
        for(int i = (int)(Math.sqrt(n));i>1;i--){
            if(n%i==0){
                res = i;
                break;
            }
        }
        return res;
    }
    public int minSteps(int n) {
        if(n==1){
            return 0;
        }
        int ans = 0;
        int mp = maxPrime(n);
        if(mp==n){
            return n;
        }
        else{
            ans+=minSteps(mp) + minSteps(n/mp);
        }
        return ans;
    }
}
