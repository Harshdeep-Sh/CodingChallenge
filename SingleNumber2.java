public class SingleNumber2 {
    public int singleNumber(int[] nums) {
        int ones = 0;
        int two = 0;
        for(int ele : nums){
            ones = ((ones^ele) & (~two));
            two = ((two^ele) & (~ones));
        }
        return ones;
    }
}
