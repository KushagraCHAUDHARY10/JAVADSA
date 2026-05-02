class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int curr_sum=0;
        if(n==1) return nums[0];
        for(int i=0; i<n; i++){
            curr_sum = Math.max(nums[i], curr_sum+nums[i]);
            if(curr_sum>=sum) sum = curr_sum;
        }
        return sum;
    }
}