// day 21
public class CountNegativeNumbersInGrid {
    public int countNegatives(int[][] grid) {
        int c = 0;
        // basic solution
        for(int[] i:grid){
            for(int j:i){
                if(j<0){
                    c++;
                }
            }
        }
        return c;
    }
}
