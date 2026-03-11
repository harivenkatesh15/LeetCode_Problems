class Solution {
    public int bitwiseComplement(int n) {
        int bitmask = (Integer.highestOneBit(n) << 1) - 1; 
       
        return Math.abs(n ^ bitmask); 
    }
}