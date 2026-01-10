class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[k];
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer, Integer>> list =
        new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue()); 
        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> entry = list.get(i);
            int value = entry.getKey();
            ans[i]=value;
        }
        return ans;
    }
}
