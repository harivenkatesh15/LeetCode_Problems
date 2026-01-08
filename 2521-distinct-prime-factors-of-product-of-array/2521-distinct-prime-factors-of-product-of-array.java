class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> primes = new HashSet<>();

        for (int num : nums) {
            // factorize each number
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    primes.add(i);
                    while (num % i == 0) {
                        num /= i;
                    }
                }
            }

            // if remaining num is prime
            if (num > 1) {
                primes.add(num);
            }
        }

        return primes.size();
    }
}
