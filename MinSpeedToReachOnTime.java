// Day 60 - LeetCode Problem 1870: Minimum Speed to Arrive on Time

public class MinSpeedToReachOnTime {
    public boolean possible(int[] dist, int mid, double hour){
        double ans = 0;
        for(int i = 0;i<dist.length;i++){
            double res = (double)dist[i]/(double)mid; 
            if(i==dist.length-1){
                ans+=res;
            }
            else{
                ans+=Math.ceil(res);
            }
        }
        if(ans<=hour){
            return true;
        }
        return false;
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        int low = 1;
        int high = (int)1e7;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(possible(dist,mid,hour)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}
