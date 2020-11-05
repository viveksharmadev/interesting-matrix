// https://leetcode.com/problems/spiral-matrix/
class Solution {
    //tc - N where N is m+n
    //sc - N where N is m+n
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new LinkedList<>();
        if(matrix==null || matrix.length==0) return result;
        
        int m = matrix.length, n = matrix[0].length;
        
        int top = 0, bottom = m-1, left = 0, right = n-1;
        
        while(top <= bottom && left <= right){
            // Left to Right
            for(int i=top; i<=right; i++)
                result.add(matrix[top][i]);
            top++;
            
            // Top to Bottom
            for(int i=top; i<=bottom; i++)
                result.add(matrix[i][right]);
            right--;
            
            if(top > bottom || left > right)
                break;
                
            // Right to Left
            for(int i=right; i>=left; i--)
                result.add(matrix[bottom][i]);
            bottom--;    
            
            // Bottom to Top
            for(int i=bottom; i>=top; i--)
                result.add(matrix[i][left]);
            left++;
        }
        return result;
    }
}
