class Solution {
    public int trap(int[] height) {
        int pt1=height[0];
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int pt2=height[height.length-1];
        for(int i=0;i<height.length;i++){
            if(height[i]>pt1){
                left[i]=height[i];
                pt1=height[i];
            }else{
                left[i]=pt1;
            }
        }
        for(int j=height.length-1;j>=0;j--){
            if(height[j]>pt2){
                right[j]=height[j];
                pt2=height[j];
            }else{
                right[j]=pt2;
            }
        }
        int ans=0;
        for(int i=0;i<height.length;i++){
                if(left[i]>right[i]){
                    ans=ans+right[i]-height[i];
                }else{
                    ans=ans+left[i]-height[i];
                }
        }
        return ans;
    }
}