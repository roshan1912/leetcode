class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int i = 0;
        int j = 0;
        int idx = 0;
        int[] result = new int[nums.length - k + 1];
        HashMap<Integer, Integer> map = new HashMap<>();
        while (j < nums.length) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            if (j - i + 1 == k) {

                PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b) -> {
                    if (!a.getValue().equals(b.getValue())) {
                        return b.getValue() - a.getValue();
                    }
                    return b.getKey() - a.getKey();
                });

                heap.addAll(map.entrySet());

                int sum = 0;
                int cnt = 0;

                while (!heap.isEmpty() && cnt < x) {
                    Map.Entry<Integer, Integer> e = heap.poll();
                    sum += e.getKey() * e.getValue();
                    cnt++;
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