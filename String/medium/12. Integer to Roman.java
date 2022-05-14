Problem Link:- https://leetcode.com/problems/integer-to-roman/


                  ******************CODE*********************
                  
                    
                    
                    
class Solution {
    public String intToRoman(int num) {
        int[]intCode = {1000 , 900 , 500 , 400 , 100 , 90 , 50 , 40 , 10 , 9 , 5 , 4 , 1};
        String[]code = {"M" , "CM" , "D" , "CD" , "C" , "XC" , "L" , "XL" , "X" , "IX" , "V" , "IV" , "I"};
        String ans = "";
        for(int i = 0; i < intCode.length; i++){
            while(num >= intCode[i]){
                ans += code[i];
                num -= intCode[i];
            }
        }
        return ans;
    }
}
