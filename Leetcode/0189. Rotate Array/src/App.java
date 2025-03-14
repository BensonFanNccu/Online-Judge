public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an integer array nums, 
         * rotate the array to the right by k steps, where k is non-negative.
         * 
         * Example:
         * Input: nums = [1,2,3,4,5,6,7], k = 3
         * Output: [5,6,7,1,2,3,4]
         * Explanation:
         * rotate 1 steps to the right: [7,1,2,3,4,5,6]
         * rotate 2 steps to the right: [6,7,1,2,3,4,5]
         * rotate 3 steps to the right: [5,6,7,1,2,3,4]
         */

        Solution sol = new Solution();

        int[] case1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] case2 = new int[]{3, 11, -99, 100};

        sol.rotate(case1, 3);
        sol.rotate2(case2, 2);
    }
}
