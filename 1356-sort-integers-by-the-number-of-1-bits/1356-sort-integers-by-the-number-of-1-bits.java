class Solution {
    public int[] sortByBits(int[] ars) {
        Integer[] arr = Arrays.stream(ars)
                              .boxed()
                              .toArray(Integer[]::new);

        Arrays.sort(arr, (i, j) -> {
            int bitCompare = Integer.compare(Integer.bitCount(i), Integer.bitCount(j));
            
            if (bitCompare == 0) {
                return Integer.compare(i, j); 
            }
            
            return bitCompare;
        });

        return Arrays.stream(arr)
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}