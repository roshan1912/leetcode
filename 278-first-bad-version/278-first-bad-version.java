/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start =1;
        int end = n;
        int ans=0;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(!isBadVersion(mid))
                start =mid+1;
            else{
                end=mid-1;
                ans=mid;
            }
        }
        return ans;
    }
}