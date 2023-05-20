public class nthTribonacci {
    public int tribonacci(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 1;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        int temp,temp1;
        for(int i = 3;i<=n;i++){
            temp = n3;
            n3 = n1+n2+n3;
            temp1 = n2;
            n2 = temp;
            n1 = temp1;
        }
        return n3;

    }
}
