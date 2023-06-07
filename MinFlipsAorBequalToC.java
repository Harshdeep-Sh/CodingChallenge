public class MinFlipsAorBequalToC {
    public int minFlips(int a, int b, int c) {
        int r1,r2,r3;
        int flips = 0;
        while(a>0 || b>0 || c>0){
            r1 = a%2;
            a = a/2;

            r2 = b%2;
            b = b/2;

            r3 = c%2;
            c = c/2;

            if(r1==0 && r2==0 && r3==1){
                flips+=1;
            }
            
            else if(r1==0 && r2==1 && r3==0){
                flips+=1;
            }

            else if(r1==1 && r2==0 && r3==0){
                flips+=1;
            }
            
            else if(r1==1 && r2==1 && r3==0){
                flips+=2;
            }
            else{
                continue;
            }
        }
        return flips;

    }
}
