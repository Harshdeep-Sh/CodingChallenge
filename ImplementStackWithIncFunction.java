// Day 58 - LeetCode Problem 1381: Design a Stack With Increment Operation

public class ImplementStackWithIncFunction {
    int[] arr;
    int top = -1;
    public ImplementStackWithIncFunction(int maxSize) {
        arr = new int[maxSize];
    }
    
    public void push(int x) {
        if(top<arr.length-1){
            arr[++top] = x;
        }
    }
    
    public int pop() {
        if(top==-1){
            return -1;
        }
        return arr[top--];
    }
    
    public void increment(int k, int val) {
        for(int i = 0;i<k && i<arr.length;i++){
            arr[i] = arr[i]+val;
        }
    }
}
