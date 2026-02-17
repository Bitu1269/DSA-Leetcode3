class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // int n= nums.length;
        // return(nums[n-k]);

        Queue<Integer> pq = new PriorityQueue<>();

        for(int num : nums){
            pq.offer(num);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.poll();
    }
}