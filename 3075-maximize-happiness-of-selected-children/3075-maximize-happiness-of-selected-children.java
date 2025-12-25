class Solution {
    public long maximumHappinessSum(int[] hap, int k) {
        long sum = 0;
        int cc = 0;
        Arrays.sort(hap);
        for(int i = hap.length-1;i>=0;i--){
            
            if(hap[i]-cc>=0){
            sum+=hap[i]-cc;
            cc++;
            }
            if(cc>=k){
                break;
            }
        }
        return sum;
    }
}