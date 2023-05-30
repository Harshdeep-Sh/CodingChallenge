public class PowXN {
    public double myPow(double x, int n) {
        if(x==1.0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        double ans=1.0;
        long nn=n;
        if(nn<0) nn=-1*nn;
        while(nn>0){
            if(nn%2==1){ //multiply normally if n is odd
                ans = ans *x;
                nn=nn-1;
            }
            else{
                x=x*x;
                nn=nn/2; // square the number itsef if number is even 
            }
        }
        if(n<0)
        ans = (double)(1.0)/(double)(ans);
        return ans;
}}
