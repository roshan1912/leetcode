class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int i = 0;
        int j = 0;
        int idx=0;
        int[] result = new int[nums.length - k + 1];
        HashMap<Integer, Integer> map = new HashMap<>();
        while (j < nums.length) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            if (j - i + 1 == k) {

                List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

                list.sort((a, b) -> {
                    if (!a.getValue().equals(b.getValue())) {
                        return b.getValue() - a.getValue();
                    }
                    return b.getKey() - a.getKey();
                });

                int sum = 0;
                int count = 0;

                for (Map.Entry<Integer, Integer> e : list) {
                    if (count == x)
                        break;
                    sum += e.getKey() * e.getValue();
                    count++;
                }

                result[idx++] = sum;

                int left = nums[i];
                map.put(left, map.get(left) - 1);
                if (map.get(left) == 0) {
                    map.remove(left);
                }
                i++;
            }
            j++;
        }
        return result;
    }
}