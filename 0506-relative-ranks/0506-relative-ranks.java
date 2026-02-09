class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));

        for (int i = 0; i < score.length; i++) {
            maxHeap.offer(new int[] { score[i], i });
        }

        int rank = 1;
        String[] ans = new String[score.length];
        while (!maxHeap.isEmpty()) {
            int[] top = maxHeap.poll();
            int index = top[1];
            if (rank == 1) {
                ans[index] = "Gold Medal";
            } else if (rank == 2) {
                ans[index] = "Silver Medal";
            } else if (rank == 3) {
                ans[index] = "Bronze Medal";
            } else {
                ans[index] = String.valueOf(rank);
            }
            rank++;
        }
        return ans;
    }
}