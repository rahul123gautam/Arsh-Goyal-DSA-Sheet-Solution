Problem link:- https://leetcode.com/problems/valid-palindrome-ii/



                      ***********************CODE**********************
                      
                        
                       
class Solution {
    public boolean validPalindrome(String s) {
        int start = 0 , end = s.length()-1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)) break;
            else{
                start++;
                end--;
            }
        }
        if(start >= end) return true;
       int start1 = start+1 , end1 = end;
        while(start1 < end1){
            if(s.charAt(start1) != s.charAt(end1)) break;
            else{
                start1++;
                end1--;
            }
        }
        if(start1 >= end1) return true;
        int start2 = start , end2 = end-1;
        while(start2 < end2){
            if(s.charAt(start2) != s.charAt(end2)) break;
            else{
                start2++;
                end2--;
            }
        }
        if(start2 >= end2) return true;
        return false;
    }
}
