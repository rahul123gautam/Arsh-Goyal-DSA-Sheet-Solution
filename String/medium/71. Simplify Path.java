Problem Link:- https://leetcode.com/problems/simplify-path/



             ************************CODE************************
             
               
class Solution {
    public String simplifyPath(String path) {
        String[] x = path.split("/");
        Stack<String> st = new Stack<>();
        for(String str : x) {
            if(!str.equals("..") && !str.equals(".") && !str.equals("")) st.push(str);
            else if(!st.isEmpty() && str.equals("..")) st.pop();
        }
        String s = "";
        while(!st.isEmpty()){
            s = "/" + st.pop()+ s;
        }
        if(s.length() == 0) return "/";
        return s;
    }
}
