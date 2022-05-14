Problem Link :- https://leetcode.com/problems/longest-common-prefix/



                 ********************CODE*********************
                 
                 
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length , min = 200;
        for(int i = 0; i < n; i++){
            min = Math.min(strs[i].length() , min);
        }
        String p = "";
        if(min == 0) return p;
        for(int i = 0; i < min; i++){
            for(int j = 1; j < n; j++){
                if(strs[j].charAt(i) != strs[j-1].charAt(i)) return p;
            }
            p += strs[0].charAt(i);
        }
        return p;
    }
}
