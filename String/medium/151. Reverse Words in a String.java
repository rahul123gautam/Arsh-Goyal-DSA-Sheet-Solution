Problem Link:- https://leetcode.com/problems/reverse-words-in-a-string/



                ********************CODE********************
                
                  
class Solution {
    public String reverseWords(String s) {
        String[]ch = s.split(" ");
        s = "";
        for(int i = ch.length - 1; i >= 0; i--){
            s += ch[i];
            if(ch[i] != ""){
                s += " ";
            }
        }
        return s.substring(0 , s.length()-1);
    }
}
