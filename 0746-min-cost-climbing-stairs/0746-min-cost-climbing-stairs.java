class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] mincos = new int[n+1];
        mincos[0] = cost[0];
        mincos[1] = cost[1];
        for(int i = 2;i<cost.length;i++){
            mincos[i] = Math.min(mincos[i-1],mincos[i-2])+cost[i];
        }
        return Math.min(mincos[n-1],mincos[n-2]);
    }
}