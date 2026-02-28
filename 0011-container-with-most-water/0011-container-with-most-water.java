class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int w = j-i;
            int sum = Math.min(height[i],height[j]) * w;
            max = Math.max(sum,max);
            if(height[i]<=height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}