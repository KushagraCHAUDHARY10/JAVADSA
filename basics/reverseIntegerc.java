//Given a signed 32-bit integer x, return x with its digits reversed.
//If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
import java.util.*;
class reverseIntegerc {
    public int reverse(int x) {
        int r_num=0;
        while(x!=0){
            int temp=x%10;
            x/=10;
            if (r_num > Integer.MAX_VALUE / 10 ||
               (r_num == Integer.MAX_VALUE / 10 && temp > 7)) return 0;
            if (r_num < Integer.MIN_VALUE / 10 ||
               (r_num == Integer.MIN_VALUE / 10 && temp < -8)) return 0;
            r_num=(r_num*10)+temp;
        }
        return r_num;
    }
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		reverseIntegerc ob = new reverseIntegerc();
		System.out.println(ob.reverse(num));
	}
}