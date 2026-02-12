class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str:strs){
            char temp[] = str.toCharArray();
            Arrays.sort(temp);
            String s = new String(temp);
            if(map.containsKey(s)){
                map.computeIfAbsent(s,k -> new ArrayList<>()).add(str);
            }
            else{
                map.put(s,new ArrayList<>());
                map.computeIfAbsent(s,k -> new ArrayList<>()).add(str);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
                    ans.add(entry.getValue());
        }
        return ans;
    }
}