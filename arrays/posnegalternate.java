//2149. Rearrange Array Elements by Sign
//You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n= nums.length;
        int j=0;
        int k=0;
        int[] pos = new int[(n/2)+1];
        int[] neg = new int[(n/2)+1];
        for(int i=0; i<n; i++){
            if(nums[i]>0){
                pos[j]=nums[i];
                j++;
            }
            else{
                neg[k]=nums[i];
                k++;
            }
        }
        j=0;
        k=0;
        for(int i=0; i<n; i++){
            if(i%2==0){
                nums[i]=pos[j];
                j++;
            }
            else{
                nums[i]=neg[k];
                k++;
            }
        }
        return nums;
    }
}