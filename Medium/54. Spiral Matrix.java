Problem Link:- https://leetcode.com/problems/spiral-matrix/



                                       *************************CODE****************************
                                       
                                         
                                         
 class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int total = m*n;
        int sRow = 0, sCol = 0 , eRow = m-1 , eCol = n-1;
        while(total > 0){
            for(int i = sCol; i <= eCol; i++){
                if(total == 0) return ans;
                ans.add(matrix[sRow][i]);
                total--;
            }
            sRow++;
            for(int i = sRow; i <= eRow; i++){
                if(total == 0) return ans;
                ans.add(matrix[i][eCol]);
                total--;
            }
            eCol--;
            for(int i = eCol; i >= sCol; i--){
                if(total == 0) return ans;
                ans.add(matrix[eRow][i]);
                total--;
            }
            eRow--;
            for(int i = eRow; i >= sRow; i--){
                if(total == 0) return ans;
                ans.add(matrix[i][sCol]);
                total--;
            }
            sCol++;
        }
        return ans;
    }
}
