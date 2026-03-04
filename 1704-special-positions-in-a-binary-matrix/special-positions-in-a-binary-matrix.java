class Solution {
    public int numSpecial(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;

        int[] rowcnt = new int[n];
        int[] colcnt = new int[m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j] == 1){
                    rowcnt[i]++;
                    colcnt[j]++;
                }
            }
        }
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j] == 1 && rowcnt[i]==1 && colcnt[j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}