class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        System.out.println(s);
        char[] tempS = s.toCharArray();
        int left=0;
        int right=tempS.length-1;
        while(left<right){
            if(tempS[left]!=tempS[right]) return false;
            left++;
            right--;
        }
        return true;
    }
}