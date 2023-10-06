// Day 74 - LeetCode Problem 343: Integer Break

class IntegerBreak{
    public int integerBreak(int n) {
        if(n==3)
            return 2;
        int max = 1;
        int contain = n;
        for(int i = 2;i<=contain/2;i++){
            n = contain;
            int prod = 1;
            int size = n/i;
            for(int j = 0;j<i;j++){
                prod = prod*size;
                n-=size;
            }
            while(n>0){
                prod = prod/size;
                prod = prod*(size+1);
                n--;
            }
            max = Math.max(max,prod);
        }
        return max;
    }
}