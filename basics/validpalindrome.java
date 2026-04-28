//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
//removing all non-alphanumeric characters, it reads the same forward and backward.
//Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.

class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuffer sb = new StringBuffer(s);
        if(sb.toString().equals(sb.reverse().toString())) return true;
        else return false;
    }
}