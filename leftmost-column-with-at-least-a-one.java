// https://leetcode.com/problems/leftmost-column-with-at-least-a-one/
/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int row, int col) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    // tc -> m+n, sc-> 1
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> dimensions = binaryMatrix.dimensions();
        
        int rows = dimensions.get(0), cols = dimensions.get(1);
        
        int row = 0, col = cols-1;
        
        int minIndex = col;
        
        while(row < rows && col >= 0){
            
            int val = binaryMatrix.get(row, col);
            
            if(val == 0){
                row++;
            }
            
            else if(val == 1){
                minIndex = Math.min(minIndex, col);
                
                col--;
            }
            
        }
        
        return minIndex == col ? -1 : minIndex;
    }
}
