// https://leetcode.com/problems/count-square-submatrices-with-all-ones/
class count-square-submatrices-with-all-ones {
    // tc -> m*n, sc-> m*n
    public int countSquares(int[][] matrix) {
        if(matrix==null || matrix.length==0) return 0;
        int m = matrix.length, n = matrix[0].length;
        
        int[][] sum = new int[m+1][n+1];
        int res = 0;
        
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(matrix[i-1][j-1]==1){
                    sum[i][j] = Math.min(sum[i-1][j-1], Math.min(sum[i-1][j], sum[i][j-1]))+1;
                    res += sum[i][j];
                }
            }
        }
        return res;
    }
}
