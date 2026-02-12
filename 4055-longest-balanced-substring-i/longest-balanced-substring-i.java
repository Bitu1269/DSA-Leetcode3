class Solution {
    public int longestBalanced(String s) {
        int n= s.length();
        int maxString =0;

        for(int i=0;i<n;i++){
            int[] cnt = new int[26];
            
            for(int j=i; j<n; j++){
                cnt[s.charAt(j) - 'a']++;
                boolean valid = true;
                int freq = -1;
                for(int k=0; k< 26; ++k){
                    if(cnt[k] >0){
                        if(freq == -1) freq = cnt[k];
                        else if(freq != cnt[k]){
                            valid = false;
                            break;
                        }    
                    }
                }
                if(valid)
                    maxString = Math.max(maxString, j-i+1);
            }
        } 
        return maxString;
    }
}