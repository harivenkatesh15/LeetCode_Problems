class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev = n&1;
        n = n>>1;
        int res = -1;
        while(n!=0){
            res = n&1;
            if(prev==res){
                return false;
            }
            prev = res;
            n = n>>1;
        }
        return true;
    }
}