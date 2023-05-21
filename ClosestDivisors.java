class Solution {
    public int[] closestDivisors(int num) {
        int[] arr = new int[2];
        for(int i=(int)Math.sqrt(num+2);i>0;--i){
            if((num+1)%i==0){
                arr[0]=i;
                arr[1]=(num+1)/i;
                return arr;
            }
            if((num+2)%i==0){
                arr[0]=i;
                arr[1]=(num+2)/i;
                return arr;
            }
        }
        return arr;
    }
}