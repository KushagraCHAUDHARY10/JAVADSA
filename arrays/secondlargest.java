class Solution {
    public int secondLargestElement(int[] nums) {
        int largest=0;
        int s_large=-1;
        int n = nums.length;

        for(int i=0; i<n-1; i++){
            if(nums[i]>largest) largest = nums[i];
            for(int j=i+1; j<n; j++){
                if(nums[j]>s_large && nums[j]<largest) s_large = nums[j];
            }
        }
        return s_large;
    }
}