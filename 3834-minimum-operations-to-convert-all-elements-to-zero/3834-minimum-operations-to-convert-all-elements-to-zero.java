import java.util.Stack;
class Solution {
    public int minOperations(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int res = 0;
        for(int ii:nums){
            while(!s.isEmpty() && s.peek()>ii){
                s.pop();
                }
            if(ii>0 && (s.isEmpty() || s.peek()<ii)){
                res+=1;
                s.push(ii);
            }

            }
        
        return res;
        
    }
}