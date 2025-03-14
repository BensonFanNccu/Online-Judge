public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an array of integers arr, return the number of subarrays with an odd sum.
         * Since the answer can be very large, return it modulo 10^9 + 7.
         * 
         * Input: arr = [1,3,5]
         * Output: 4
         */
        
        Solution sol = new Solution();

        int[] case1 = new int[] {1, 3, 5};
        int[] case2 = new int[] {2, 4, 6};
        int[] case3 = new int[] {1, 2, 3, 4, 5, 6, 7};

        System.out.println(sol.numOfSubarrays(case1));
        System.out.println(sol.numOfSubarrays(case2));
        System.out.println(sol.numOfSubarrays(case3));
    }
}
