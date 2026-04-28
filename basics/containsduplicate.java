//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
import java.util.*;
class containsduplicate {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=1; i<n; i++){
            if(nums[i]==nums[i-1]){
                 return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int x = sc.nextInt();
		int[] nums = new int[x];
		System.out.println("Enter the elements: ");
		for(int i=0; i<x; i++){
			nums[i] = sc.nextInt();
		}
		containsduplicate ob = new containsduplicate();
		System.out.println(ob.containsDuplicate(nums));
	}
}