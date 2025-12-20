class Solution {
    public int minDeletionSize(String[] strs) {
        char prev;
        boolean flag = true;
        int cc = 0;
        for(int i = 0;i<strs[0].length();i++){
            prev = ' ';
            flag = true;

            for(int j = 0;j<strs.length;j++){
                if(strs[j].charAt(i)<prev){
                    flag = false;
                    break;
                }
                prev = strs[j].charAt(i);
            }
            if(!flag){
                cc++;
            }
        }
        return cc;
    }
}