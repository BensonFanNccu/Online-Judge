public class App {
    public static void main(String[] args) throws Exception {
        /*
         * You are given an array nums consisting of positive integers.
         * We call a subarray of nums nice if the bitwise AND of every pair of elements 
         * that are in different positions in the subarray is equal to 0.
         * 
         * Return the length of the longest nice subarray.
         * 
         * A subarray is a contiguous part of an array.
         * 
         * Note that subarrays of length 1 are always considered nice.
         */
        
        Solution sol = new Solution();

        int[] case1 = new int[] {1, 3, 8, 48, 10};
        int[] case2 = new int[] {3, 1, 5, 11, 13};

        System.out.println(sol.longestNiceSubarray(case1));
        System.out.println(sol.longestNiceSubarray(case2));
    }
}
