class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max=0;
        for(int num:nums){
            if(!set.contains(num-1)){// we need tp check for previous element in set because if the element is not the smallest we might have to iterate for n^2 time which will give TLE eventually.
                int curr = num;
                int count =1;
                while(set.contains(curr+1)){
                    curr += 1;
                    count +=1;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}