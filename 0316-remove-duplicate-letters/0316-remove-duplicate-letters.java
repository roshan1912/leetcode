class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        boolean[] seen = new boolean[26];
        Stack<Character> stk = new Stack<>();

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']--;
            if (seen[ch - 'a'])
                continue;

            while (!stk.isEmpty() &&
                stk.peek() > ch &&
                freq[stk.peek() - 'a'] > 0) {
                seen[stk.pop() - 'a'] = false;
            }

            stk.push(ch);
            seen[ch - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stk) {
            sb.append(c);
        }
        return sb.toString();
    }
}
