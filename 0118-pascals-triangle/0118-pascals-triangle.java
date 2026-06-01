class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> arr = new ArrayList<>();
    
        int sum = 0;
        for(int i = 0;i<n;i++){
            List<Integer> res = new ArrayList<>();
            for(int j = 0;j<i+1;j++){
                if(j==0 || j==i)
                    res.add(1);
                else{
                    List<Integer> row = arr.get(i-1);
                    res.add(row.get(j)+row.get(j-1));
                }
                
            }
            arr.add(res);

        }
       
        return arr;
    }
}