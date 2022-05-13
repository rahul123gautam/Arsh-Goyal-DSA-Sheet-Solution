Problem Link:- https://leetcode.com/problems/word-search/



                   ***********************CODE************************
                   
                     
class Solution {
    private boolean[][]taken;
    private int m , n;
    private String word;
    public boolean exist(char[][] board, String word1) {
        m = board.length;
        n = board[0].length;
        word = word1;
        taken = new boolean[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == word1.charAt(0)){
                    if(wordSearch(board , i , j , 0)) return true;
                }
            }
        }
        return false;
    }
    public boolean wordSearch(char[][]board , int i , int j , int idx){
        if(i < 0 || j < 0 || i == m || j == n) return false;
        if(board[i][j] != word.charAt(idx) || taken[i][j]) return false;
        if(idx == word.length()-1) return true;
        taken[i][j] = true;
        boolean found = wordSearch(board , i+1 , j , idx+1) || wordSearch(board , i-1 , j , idx+1) ||                       wordSearch(board , i , j+1 , idx+1) || wordSearch(board , i , j-1 , idx+1);
        taken[i][j] = false;
        return found;
    }
}
