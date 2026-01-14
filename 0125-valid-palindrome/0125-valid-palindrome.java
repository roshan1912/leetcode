class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase();
        s= s.replaceAll("[^a-z0-9]","");
        char[] str = s.toCharArray();
        int start=0;
        int end = str.length-1;
        System.out.println(s);
        while(start<end){
            if(str[start]!=str[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}