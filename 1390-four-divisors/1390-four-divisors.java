class Solution {
    public int sumFourDivisors(int[] nums) {
        int cc = 0;
        int c = 0;
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            cc = 0;
            c = 0;
            for(int j = 1;j*j<=nums[i];j++){
                if(nums[i]%j==0){
                    cc+=j;
                    c++;
                    if(nums[i]/j!=j){
                    cc+=nums[i]/j;
                    c++;
                    }
                    
                }
            }
            
            if(c==4){
                ans+=cc;
            }
        }
        return ans;
    }
}