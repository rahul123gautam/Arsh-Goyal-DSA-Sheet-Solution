Problem Link:- https://leetcode.com/problems/container-with-most-water/






                            *********************CODE***********************
                            
                              
class Solution {
    public int maxArea(int[] height) {
        int ans = 0, start = 0, end = height.length-1;
        while(start < end){
            int min = Math.min(height[start] , height[end]);
            int length = end - start;
            int area = min*length;
            ans = Math.max(ans , area);
            if(height[start] > height[end]) end--;
            else start++;
        }
        return ans;
    }
}
