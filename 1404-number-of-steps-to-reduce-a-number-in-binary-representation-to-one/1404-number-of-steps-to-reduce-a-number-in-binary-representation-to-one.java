class Solution {
    public int numSteps(String s) {
        int carry =0;

        int ans =0;
        int n = s.length();
        for(int i=n-1;i>=1;i--){
            int bit = s.charAt(i)-'0';
            int val = (bit+carry)%2;
            carry = (carry+bit)/2;

            if(val==1){
                carry =1;
                ans+=2;
            }else{
                ans++;
            }
        }

        if(carry!=0){
            ans++;
        }
        return ans;
    }
}