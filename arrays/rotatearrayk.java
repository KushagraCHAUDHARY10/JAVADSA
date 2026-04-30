//Rotate Array
//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative
class Solution {
    public void rotate(int[] nums, int k) {
        // while(k!=0){
        //     int temp = nums[nums.length-1];
        //     for(int i=nums.length-2; i>=0; i--){
        //         nums[i+1]=nums[i];
        //     }
        //     nums[0]=temp;
        //     k--;
        // } TIME LIMIT :(
        int n = nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    void reverse(int[] nums, int i, int j){
        while(i<j){
            int temp= nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j--;
            i++;
        }
    }
}