class Solution {
    public int countPrimeSetBits(int left, int right) {
        // Prime num= 2, 3, 5, 7, 11, 13, 17 ....

        HashSet<Integer> set = new HashSet<>(
            Arrays.asList(2,3,5,7,11,13,17,19,31)
        );

        int count=0;
        for(int i=left; i<=right; i++){
            int bits = Integer.bitCount(i);
            if(set.contains(bits)){
                count++;
            }
            
        }
        return count;
    }
}