Problem Link:- https://leetcode.com/problems/basic-calculator-ii/


                        ********************CODE*********************
                        
 class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int n = s.length();
        char sign = '+';
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int val = 0;
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                       val = val*10 + (s.charAt(i)-'0');
                       i++;
                }
                i--;
                if(sign == '+') st.push(val);
                else if(sign == '-')st.push(-val);
                else if(sign == '/'){
                         int val1 = st.pop();
                         val1 = val1/val;
                         st.push(val1);
                }else{
                      int val1 = st.pop();
                      val1 = val1*val;
                      st.push(val1);
                }
            }else if(ch != ' ') sign = ch;
        }
        int ans = 0;
        while(!st.isEmpty()) ans += st.pop();
        return ans;
    }
}
