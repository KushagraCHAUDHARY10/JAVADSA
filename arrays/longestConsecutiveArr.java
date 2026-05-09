class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int count=1;
        int max_count=1;
        Arrays.sort(nums);
        for(int i=1; i<n; i++){
            if(nums[i]==nums[i-1]+1){
                count++;
            }
            else if(nums[i]==nums[i-1]) continue;
            else count=1;
            max_count=Math.max(max_count,count);
        }
        return max_count;
    }
}