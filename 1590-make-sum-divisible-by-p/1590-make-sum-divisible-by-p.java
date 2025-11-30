import java.util.HashMap;

class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length; // Get the size of the input array
        long sum = 0;        // Initialize the total sum of the array elements
        
        // Calculate the sum of all elements in the array
        for (int num : nums) {
            sum += num;
        }
        
        // If the sum is already divisible by p, no subarray needs to be removed
        if (sum % p == 0) {
            return 0;
        }
        
        int target = (int)(sum % p);              // We need to remove a subarray with sum = target (sum % p)
        HashMap<Integer, Integer> remainderIdx = new HashMap<>(); // Store the remainder and its corresponding index
        remainderIdx.put(0, -1);                  // Initialize for case where the prefix sum itself meets the requirement
        
        long currSum = 0;  // Track the current cumulative sum (mod p)
        int minSize = n;   // Set the initial subarray size to the maximum (n)
        
        // Traverse the array to find the minimum subarray to remove
        for (int i = 0; i < n; i++) {
            currSum = (currSum + nums[i]) % p;      // Update the cumulative sum mod p
            int diff = (int)((currSum - target + p) % p);  // Calculate the required difference to match target
            
            // If the required remainder exists in the map, update the minimum subarray size
            if (remainderIdx.containsKey(diff)) {
                minSize = Math.min(minSize, i - remainderIdx.get(diff)); // Update minSize if a smaller subarray is found
            }
            
            // Update the map with the current remainder and index
            remainderIdx.put((int) currSum, i);
        }
        
        // If no valid subarray is found, return -1; otherwise, return the minSize
        return minSize == n ? -1 : minSize;
    }
}