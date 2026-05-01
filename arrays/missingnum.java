//Find missing number
//Given an integer array of size n containing distinct values in the range from 0 to n (inclusive), return the only number missing from the array within this range.
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum=0;
        int exp_sum=0;

        for(int i=1; i<=n; i++){
            exp_sum+=i;
        }
        for(int i=0; i<n;i++){
            sum+=nums[i];
        }

        return exp_sum - sum;
    }
}