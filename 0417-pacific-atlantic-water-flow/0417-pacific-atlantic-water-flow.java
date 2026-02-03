class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] h) {
        int m = h.length;
        int n = h[0].length;
        int[][] pacific = new int[m][n];
        int[][] atlantic = new int[m][n];
        List<List<Integer>> res = new ArrayList<>();
        for (int c = 0; c < n; c++) {
            dfs(h,0, c, Integer.MIN_VALUE,pacific);      
        }
        for (int r = 0; r < m; r++) {
            dfs(h,r, 0,Integer.MIN_VALUE, pacific);      
        }

        for (int c = 0; c < n; c++) {
            dfs(h,m - 1, c, Integer.MIN_VALUE,atlantic); 
        }
        for (int r = 0; r < m; r++) {
            dfs(h,r, n - 1, Integer.MIN_VALUE,atlantic); 
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(pacific[i][j]==1 && atlantic[i][j]==1){
                    res.add(Arrays.asList(i, j));
                }
            }
        }
        return res;
    }
    public void dfs(int[][] m,int i,int j,int prev,int[][] ocean){
        if(i<0 || j<0 || i>=m.length || j>=m[0].length){
            return;
        }
        if(prev>m[i][j]){
            return;
        }
        if(ocean[i][j]==1){
            return;
        }

        ocean[i][j] = 1;
        dfs(m,i+1,j,m[i][j],ocean);
        dfs(m,i-1,j,m[i][j],ocean);
        dfs(m,i,j+1,m[i][j],ocean);
        dfs(m,i,j-1,m[i][j],ocean);
    }
}