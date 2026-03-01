class Solution {
    public int minPartitions(String s) {
        int max = s.charAt(0);
        int ind = 0;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i)>max){
                max = s.charAt(i);
                ind = i;
            }
        }  
        System.out.println(s.charAt(ind));  
        return s.charAt(ind)-'0';

    }
}