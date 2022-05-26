Problem Link:- https://leetcode.com/problems/group-anagrams/




                ****************************CODE*****************************
                
                  
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>ans = new ArrayList<>();
        HashMap<String , List<String>>map = new HashMap<>();
        for(String s : strs){
            char[]ch = s.toCharArray();
            Arrays.sort(ch);
            String p = "";
            for(int i = 0; i < ch.length; i++) p += ch[i];
            if(map.containsKey(p)){
                map.get(p).add(s);
            }else{
                List<String>list = new ArrayList<>();
                list.add(s);
                map.put(p , list);
            }
        }
        ans.addAll(map.values());
        return ans;
    }
}
