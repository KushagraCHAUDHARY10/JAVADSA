class Solution {
    public void nextPermutation(int[] nums) {
        // int i=nums.length-1;
        // int change=0;
        // while(i>0){
        //     if(nums[i]>nums[i-1]){
        //         int temp = nums[i];
        //         nums[i]=nums[i-1];
        //         nums[i-1]=temp;
        //         change=1;
        //         break;
        //     }
        //     else{
        //         change=0;
        //         i--;
        //     }
        // }
        // if(change==0){
        //     Arrays.sort(nums);
        // }
        int n = nums.length;
    int i = n-2;
    while(i>=0 && nums[i]>=nums[i+1]){
        i--;
    }
    if (i >= 0) {
        int j = n - 1;
        while (nums[j] <= nums[i]) {
            j--;
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    reverse(nums, i + 1, n - 1);
    }
    void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
}