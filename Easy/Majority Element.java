Problem Link:- https://leetcode.com/problems/majority-element/





                    *************************Code***********************
                    
                    
                    
    class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer>map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
        }
        int majoElement = 0;
        int noOfMajoElement = 0;
        for(int i : map.keySet()){
            if(noOfMajoElement < map.get(i)){
                majoElement = i;
                noOfMajoElement = map.get(i);
            }
        }
        return majoElement;
    }
}
