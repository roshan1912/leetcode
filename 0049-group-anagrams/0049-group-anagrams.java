class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            String key = transform(s);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    private String transform(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append('#');
            sb.append(freq[i]);
        }

        return sb.toString();
    }
}
