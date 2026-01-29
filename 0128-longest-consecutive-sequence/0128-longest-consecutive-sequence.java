class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1){
              return nums.length;
        }
        TreeSet<Integer> set = new TreeSet<>();
        int c = 0;
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ArrayList<Integer> res = new ArrayList<>(set);
        for(int i = 0;i<res.size()-1;i++){
            if(res.get(i)+1==res.get(i+1)){
                c++;
            }
            else{
                if(c+1>max){
                    max = c+1;
                }
                c=0;
            }

        }
        if(c+1>max){
            max = c+1;
        }
        return max;
    }
}