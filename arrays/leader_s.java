class Solution {
    public List<Integer> leaders(int[] nums) {
        int n = nums.length;
        List<Integer> leads = new ArrayList<>();
        for(int i = 0; i<n-1; i++){
            int k = i;
            for(int j = i+1; j<n; j++){
                if(nums[i]>nums[j]) k++;
                else continue;
            }
            if(k==n-1){
                leads.add(nums[i]);
            }
        }
        leads.add(nums[n-1]);
        return leads;
    }
}