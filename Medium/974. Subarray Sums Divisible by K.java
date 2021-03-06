Problem Link :- https://leetcode.com/problems/subarray-sums-divisible-by-k/



Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [4,5,0,-2,-3,1], k = 5
Output: 7
Explanation: There are 7 subarrays with a sum divisible by k = 5:
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
Example 2:

Input: nums = [5], k = 9
Output: 0
 

Constraints:

1 <= nums.length <= 3 * 104
-104 <= nums[i] <= 104
2 <= k <= 104
  
  
  
  
                                  ***************************CODE****************************
                                  
  
  
  class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int subArray = 0 , sum = 0;
        HashMap<Integer , Integer>map = new HashMap<>();
        map.put(0 , 1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            sum  = sum%k;
            sum = sum < 0 ? sum + k : sum;
            if(map.containsKey(sum)){
                subArray += map.get(sum);
                map.put(sum , map.get(sum) + 1);
            }else map.put(sum , 1);
        }
        return subArray;
    }
}
