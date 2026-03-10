class Solution {
    public int findLengthOfLCIS(int[] nums) {
        //Sliding Window Approach
        int n = nums.length;
        int left=0,right=1;
        int maxLen = 1;

        while(right < nums.length){
            if(nums[right] > nums[right-1]){
                maxLen = Math.max(maxLen, right-left+1);
                right++;
            }else{
                left = right;
                right++;
            }
        }
        return maxLen;
    }
}