class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        int c = 0;
        while(i<nums.length){
            int cor = nums[i]-1;

            if(nums[i]!=cor && nums[i]!=nums[cor]){
                int temp = nums[cor];
                nums[cor] = nums[i];
                nums[i] = temp;

            }
            else{
                i++;
                c=0;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int j = 0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans.add(nums[j]);
            }
        }
        return ans;
    }
}