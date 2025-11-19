class Solution {
    public int findFinalValue(int[] nums, int k) {
        HashSet<Integer> arr = new HashSet<>();
        for(int i:nums){
            arr.add(i);
        }
        while(arr.contains(k)){
            k*=2;
        }
        return k;
    }
}