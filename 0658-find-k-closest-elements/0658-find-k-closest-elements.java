class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0]; // smaller distance first
            }
            return a[1] - b[1]; // smaller value first
        });

        for (int i = 0; i < arr.length; i++) {
            minHeap.offer(new int[] { Math.abs(arr[i] - x), arr[i] });
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            int[] top = minHeap.poll();
            int value = top[1];
            ans.add(value);
        }
        Collections.sort(ans);
        return ans;
    }
}