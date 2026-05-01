//Single Number - I
//Given an array of nums of n integers. Every integer in the array appears twice except one integer. Find the number that appeared once in the array.
class Solution {
    public int singleNumber(int[] nums) {
        int xor=0;
        for(int i=0; i<nums.length; i++){
            xor^=nums[i];
        }
        return xor;
    }
}