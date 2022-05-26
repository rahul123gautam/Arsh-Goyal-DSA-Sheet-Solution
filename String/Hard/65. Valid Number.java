Problem Link:- https://leetcode.com/problems/valid-number/

              **********************************CODE*************************************
              
class Solution {
    public boolean isNumber(String s) {
        int n = s.length();
        boolean digitSeen = false , eSeen = false, dotSeen = false;
        int minPlusSeen = 0;
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            //Digits
            if(Character.isDigit(ch)){
                digitSeen = true;
            }
            //Minus Plus
            else if(ch == '+' || ch == '-'){
                if(minPlusSeen == 2){
                    return false;
                }
                if(i > 0 && (s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')){
                    return false;
                }
                if(i == n - 1){
                    return false;
                }
                minPlusSeen++;
            }
            //Dot
            else if(ch == '.'){
                if(eSeen || dotSeen){
                    return false;
                }
                if(i == n - 1 && !digitSeen){
                    return false;
                }
                dotSeen = true;
            }
            //e/E
           else if(ch == 'e' || ch == 'E'){
                if(eSeen || !digitSeen || i == n - 1){
                    return false;
                }
                eSeen = true;
            }else{
               return false;
           }
            
        }
        return true;
    }
}
