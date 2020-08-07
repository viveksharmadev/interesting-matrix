// https://leetcode.com/problems/number-of-corner-rectangles/
class Solution {
    /**
    Consider i and j are horizontal lines and k is vertical line
    count is to count vertical lines, hence count*(count-1)/2 
    will accumulate the sum of n-1 rectangles(1,2,..,n-1) made 
    by n vertical lines
    **/
    // tc -> n^2*m, sc-> 1
    public int countCornerRectangles(int[][] grid) {
        if(grid==null || grid.length==0)
            return 0;
        
        int m = grid.length, n =grid[0].length;
        
        int res = 0;
        for(int i=0; i<m; i++){
            for(int j=i+1; j<m; j++){
                int count = 0;
                for(int k=0; k<n; k++){
                    if(grid[i][k]==1 && grid[j][k]==1)
                        count++;
                }
                res += count*(count-1)/2;
            }
        }
        return res;
    }
}
