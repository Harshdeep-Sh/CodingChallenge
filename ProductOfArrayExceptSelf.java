import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int c = 0;
        int pdt = 1;
        int index = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
                index = i;
            }
            else{
                pdt = pdt*nums[i];
            }
        }
        int[] arr = new int[nums.length];
        Arrays.fill(arr,0);
        if(c==1){
            arr[index] = pdt;
        }
        else if(c>1){
            return arr;
        }
        else{
            for(int i = 0;i<nums.length;i++){
                arr[i] = pdt/nums[i];
            }
        }
        return arr;
    }
}
