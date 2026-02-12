class Solution {
    public String reverseWords(String s) {
       String ss = s.trim();
        StringBuilder sr = new StringBuilder();
        int prev = ss.length();
        int i = ss.length()-1;
        while(i>=0){
            if(ss.charAt(i)==' ' && i>=0){
               sr.append(ss.substring(i+1,prev)).append(" ");
                if(i<=0) break;
                while (ss.charAt(i)==' ' && i>=0) i--;
                prev = i+1;
                continue;
            }
            i--;
        }
        if(i+1>=0) sr.append(ss.substring(i+1,prev));
       return sr.toString();
    }
}