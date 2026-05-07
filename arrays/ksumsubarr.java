class Solution {
    public int longestSubarray(int[] nums, int k) {
       int max_count=0;
       int n = nums.length;
       for(int i=0; i<n; i++){
        int count=1;
        int sum = nums[i];
        for(int j=i+1; j<n; j++){
            sum+=nums[j];
            count++;
            if(sum==k){
            max_count= Math.max(max_count, count);
            }
        }
        if(nums[i]==k) max_count = Math.max(max_count, 1);
       }
       return max_count;
    }
}