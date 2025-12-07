class Solution {
    public int countOdds(int low, int high) {
        int c = 0;
        if(low%2!=0){
            c++;
            low++;
        }
        if(high%2!=0){
            c++;
            high--;
        }
        c+=(high-low)/2;
        return c;
    }
}