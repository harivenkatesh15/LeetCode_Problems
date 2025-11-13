class Solution {
    public int maxOperations(String s) {
        int ones = 0;
        int operations = 0;
        char prev = ' ';
        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++; 
            } 
            else if(prev=='1' && c=='0'){ 
                operations += ones;
            }
            prev = c;
        }

        return operations;
    }
}