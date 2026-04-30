class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // int n = nums.length;
        // int count_prev=0;
        // for(int i=0; i<n; i++){
        //     int j=i;
        //     if(nums[i]==1){
        //         int count=0;
        //         while(j < n && nums[j] != 0){
        //             count++;
        //             if(count>count_prev){
        //                 count_prev=count;
        //             }
        //             j++;
        //         }
        //     }
        // }
        // return count_prev;
        int count=0;
        int max=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
                if(count>max)
                    max=count;
            }
            else{
                count=0;
            }
        }
        return max;
    }
}