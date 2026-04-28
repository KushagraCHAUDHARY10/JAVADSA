//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
//removing all non-alphanumeric characters, it reads the same forward and backward.
//Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.
import java.util.*;
class validpalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuffer sb = new StringBuffer(s);
        if(sb.toString().equals(sb.reverse().toString())) return true;
        else return false;
    }
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sring: ");
		String s = sc.nextLine();
		validpalindrome ob = new validpalindrome();
		System.out.println(ob.isPalindrome(s));
	}
}