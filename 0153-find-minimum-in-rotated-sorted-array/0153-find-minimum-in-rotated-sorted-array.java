class Solution {
    public int findMin(int[] nums) {
        int start =0;
        int end=nums.length-1;
        int min = Integer.MAX_VALUE;
        if(nums.length==1) return nums[0];
        while(start<=end){
            int temp = Math.min(nums[start],nums[end]);
            min = Math.min(temp,min);
            start++;
            end--;
        }
        return min;
    }
}