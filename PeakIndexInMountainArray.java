public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length;
        while(low<high){
            int mid = (low+high)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
            else if(arr[mid]<arr[mid+1]){
                low = mid+1;
            }
            else if(arr[mid]<arr[mid-1]){
                high = mid;
            }
        }
        return 1;
    }
}
