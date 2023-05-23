import java.util.*;
public class KthLargestInStream {
    private PriorityQueue<Integer> pq = new PriorityQueue<>();
    private int k;
    public KthLargestInStream(int k, int[] nums) {
        this.k = k;
        for(int n:nums){
            add(n);
        }
    }
    public int add(int val) {
        pq.offer(val);
        if(pq.size()>k){
            pq.poll();
        }
        return pq.peek();
    }
}
