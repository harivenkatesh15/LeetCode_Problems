class Solution {
    public List<Integer> spiralOrder(int[][] m) {
       
        List<Integer> ans = new ArrayList<>();
        int l = 0;
        int u = 0;
        int r = m[0].length-1;
        int b = m.length-1;
        int n = r*b;
        while(l<=r && u<=b){

            for(int j = l;j<=r;j++){
                ans.add(m[l][j]);
            }
            u++;

            for(int j = u;j<=b;j++){
                ans.add(m[j][r]);
            }
            r--;
            if(u>b || l>r ){
                break;
            }
            for(int j = r;j>=l;j--){
                ans.add(m[b][j]);
            }
            b--;
            for(int j = b;j>=u;j--){
                ans.add(m[j][l]);
            }
            l++;


        }
        return ans;
    }
}