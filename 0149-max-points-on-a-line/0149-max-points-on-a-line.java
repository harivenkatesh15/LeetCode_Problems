class Solution {
    public int maxPoints(int[][] points) {
        int v = 0;
        int ans = 1;
        for(int i = 0;i<points.length;i++){
            int[] a1 = points[i];
            int local = 0;
            HashMap<Double,Integer> map = new HashMap<>();
            v = 0;
            for(int j = i+1;j<points.length;j++){
                int[] a2 = points[j];
                if(a2[0]-a1[0]==0){
                    v++;
                    local = Math.max(local,v);
                }
                else{
                    double slope = (double)(a2[1]-a1[1])/(a2[0]-a1[0]);
                    if (slope == -0.0) slope = 0.0;
                    map.put(slope,map.getOrDefault(slope,0)+1);
                    local = Math.max(local,map.get(slope));
                }

            }
            ans = Math.max(ans,local+1);
        }
        return ans;
    }
}
