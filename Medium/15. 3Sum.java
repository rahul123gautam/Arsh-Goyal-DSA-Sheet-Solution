Problem Link :- https://leetcode.com/problems/3sum/



                    ********************CODE********************
                    
                      
  class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(i == 0 || i > 0 && nums[i] != nums[i-1]){
                int start = i+1;
                int end = nums.length-1;;
                while(start < end){
                    if(nums[i] + nums[start] + nums[end] == 0){
                        ans.add(Arrays.asList(nums[i] , nums[start] , nums[end]));
                        while(start < end && nums[start] == nums[start+1]) start++;
                        while(start < end && nums[end] == nums[end-1]) end--;
                        start++;
                        end--;
                    }else if(nums[i] + nums[start] + nums[end] < 0) start++;
                    else end--;
                }
            }
        }
        return ans;
    }
}
