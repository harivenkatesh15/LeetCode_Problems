class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        List<Integer> arr = new ArrayList<>();
        arr.add(nums[0]>0?nums[0]:0);
        arr.add(Math.max(arr.get(0),nums[1]));
        for(int i = 2;i<nums.length;i++){
            arr.add(Math.max(arr.get(i-1),arr.get(i-2)+nums[i]));
        }
        return arr.get(arr.size()-1);
    }
}