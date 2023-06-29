// Day 40 - LeetCode Problem 295: Find Median from Data Stream

import java.util.ArrayList;
public class FindMedianfromDataStream {
    public int pos(ArrayList<Integer> a,int ele){
        for(int i = 0;i<a.size();i++){
            if(a.get(i)>=ele){
                return i;
            }
        }
        return -1;
    }
    ArrayList<Integer> arr = new ArrayList<>();
    public FindMedianfromDataStream() {

    }
    
    public void addNum(int num) {
        if(arr.size()==0){
            arr.add(num);
        }
        else{
            if(pos(arr,num)==-1){
                arr.add(num);
            }
            else{
                arr.add(pos(arr,num),num);
            }
        }
    }
    
    public double findMedian() {
        if(arr.size()%2==1){
            return arr.get((arr.size()/2));
        }
        else{
            return (double)(arr.get((arr.size()/2)) + arr.get((arr.size()/2)-1))/2;
        }
    }
}
