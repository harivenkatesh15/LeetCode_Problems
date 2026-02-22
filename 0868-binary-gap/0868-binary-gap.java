class Solution {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        int k = s.length();
        int max = 0;
        int i = 0;
        while(i<k){
                if(s.charAt(i)=='1'){
                    int j = i+1;
                    while(j<k && s.charAt(j)!='1'){
                        j++;
                    }
                     if(j==k){
                             break;
                        }
                max = Math.max(max,j-i);
                i = j;
                }
                else{
                    i++;
                }
               
        }
        
        return max;
    }
}