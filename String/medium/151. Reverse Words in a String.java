Problem Link:- https://leetcode.com/problems/reverse-words-in-a-string/



                ********************CODE********************
                
                  
class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        int start = 0 , end = arr.length-1;
        while(start < end){
            String temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        String ans = "";
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != ""){
                ans += arr[i];
                ans += " ";
            }
        }
        end = ans.length() - 1;
        while(ans.charAt(end) == ' ') end--;
        return ans.substring(0 , end+1);
    }
}
