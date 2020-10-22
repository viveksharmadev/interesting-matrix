// https://leetcode.com/problems/search-a-2d-matrix-ii/
class Solution {
    // tc -> m+n, sc-> 1
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0) return false;
        
        int m = matrix.length, n = matrix[0].length;
        
        int row = 0, col = n-1;
        
        while(row < m && col >=0){
            if(matrix[row][col] == target) 
                return true;
            
            else if(target < matrix[row][col])
                    col--;
            
            else
                    row++;
        }
        
        return false;
    }
}
