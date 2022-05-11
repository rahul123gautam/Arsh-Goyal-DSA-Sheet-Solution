Problem Link:- https://leetcode.com/problems/4sum/


                  *****************************CODE******************************
                  
                    
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>>ans = new ArrayList<>();
        for(int i = 0; i < nums.length - 3; i++){
            if(i == 0 || i > 0 && nums[i] != nums[i-1]){
                for(int j = i+1; j < nums.length-2; j++){
                    if(j == i+1 || j > i+1 && nums[j] != nums[j-1]){
                        int start = j+1;
                        int end = nums.length-1;
                        while(start < end){
                            if(nums[i] + nums[j] + nums[start] + nums[end] == target){
                                ans.add(Arrays.asList(nums[i] , nums[j] , nums[start] , nums[end]));
                                while(start < end && nums[start] == nums[start+1]) start++;
                                while(start < end && nums[end] == nums[end-1])end--;
                                start++;
                                end--;
                            }else if(nums[i] + nums[j] + nums[start] + nums[end] < target)start++;
                            else end--;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
