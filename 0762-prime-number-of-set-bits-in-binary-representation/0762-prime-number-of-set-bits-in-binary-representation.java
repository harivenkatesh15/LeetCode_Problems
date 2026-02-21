class Solution {

    public int countPrimeSetBits(int l, int r) {

        // Prime lookup till 32
        boolean[] isPrime = new boolean[33];
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31};

        for(int p : primes){
            isPrime[p] = true;
        }

        int count = 0;

        for(int i = l; i <= r; i++){
            int setBits = Integer.bitCount(i);   // O(1) optimized
            if(isPrime[setBits]){
                count++;
            }
        }

        return count;
    }
}