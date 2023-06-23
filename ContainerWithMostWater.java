// day 35 - LeetCode Problem 11: Container With Most Water

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int area = 0;
        int left = 0;
        int right= height.length-1;
        while(left<right){
            
            if(height[left]<height[right]){
                area = Math.max((right-left)*height[left],area);
                left++;
            }
            else if(height[left]>height[right]){
                area = Math.max((right-left)*height[right],area);
                right--;
            }
            else if(height[left]==height[right]){
                area = Math.max((right-left)*height[left],area);
                left++;
                right--;
            }
        }
        return area;
    }
}
