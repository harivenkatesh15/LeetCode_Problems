class Solution {
    public List<String> commonChars(String[] s) {
        int[] arr = new int[26];
        Arrays.fill(arr,Integer.MAX_VALUE);
        for(String str:s){
            int[] temp = new int[26];
            for(char c:str.toCharArray()){
                temp[c-'a']++;
            }
            for(int i=0;i<26;i++){
                arr[i] = Math.min(arr[i],temp[i]);
            }
        }
        List<String> ans = new ArrayList<>();
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                for(int j=0;j<arr[i];j++){
                    ans.add(String.valueOf((char)(i+'a')));
                }
            }
        }
        return ans;
    }
}