import java.util.Arrays;

public class MaximumCoinsYouCanGet {
    public int maxCoins(int[] piles) {

        Arrays.sort(piles);
        System.out.println(Arrays.toString(piles));
        int k=0;
        int sum=0;
        int idx= piles.length-2;
        while(k!= ((piles.length)/3) ){
            sum=sum+piles[idx];
            idx=idx-2;
            k++;
        }
        return sum;
    }
}
