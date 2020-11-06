// https://leetcode.com/problems/diagonal-traverse/

class Solution {
    // tc -> m*n(Not nested but count of all elements in matrix)
    // sc -> m*n (For result array)
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0) return new int[]{};
        
        int m = matrix.length, n = matrix[0].length;
        
        int[] result = new int[m*n];
        
        int row = 0, col = 0;
        
        for(int i=0; i<m*n; i++){
            result[i] = matrix[row][col];
            
            if((row+col)%2==0){  // Go up
                
                // First row and non last column
                // Go right
                if(row==0 && col!=n-1){
                    col++;
                }
                
                // Last column and not last row
                // Go down
                else if(col==n-1 && row!=m-1){
                    row++;
                }
                
                // Not First row and Not last column
                // Go right and up
                else{
                    col++; row--;
                }
            }
            
            else{ // Go down
                
                // First column and non last row
                // Go down
                if(col==0 && row!=m-1){
                    row++;
                }
                
                // Last row and non last column
                // Go right
                else if(row==m-1 && col!=n-1){
                    col++;
                }
                
                // Not last row and not last column
                // Go left and down
                else{
                    col--; row++;
                }
            }
        }
        
        return result;
    }
}
