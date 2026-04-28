//Given an integer x, return true if x is a palindrome, and false otherwise.
//Example 1:
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
import java.util.*;
public class palindrome {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rev=0;
        int y=x;
        while(x!=0){
            rev= (rev*10)+x%10;
            x/=10;
        }
        if(y==rev){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x = sc.nextInt();
		palindrome ob = new palindrome();
		System.out.println(ob.isPalindrome(x));
	}
}