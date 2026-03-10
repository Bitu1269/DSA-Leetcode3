class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        int ans=1, curr=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]<nums[i])curr++;
            else{
                ans = Math.max(ans, curr);
                curr = 1;
            }
        }
        return Math.max(ans, curr);
    }
}