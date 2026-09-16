class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        while (n > 0) {
            int num = n % 10;
            map.put(num, map.getOrDefault(num, 0) + 1);
            n = n / 10;
        }
        for (int key : map.keySet()) {
            ans = ans + key * map.get(key);
        }
        return ans;
    }
}