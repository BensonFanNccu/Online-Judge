import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given two integer arrays nums1 and nums2, return an array of their intersection. 
         * Each element in the result must be unique and you may return the result in any order.
         * 
         * Example:
         * Input: nums1 = [1,2,2,1], nums2 = [2,2]
         * Output: [2]
         */

        Solution sol = new Solution();

        int[] case1 = new int[] {1, 2, 2, 1};
        int[] case2 = new int[] {2, 2};

        System.out.println(Arrays.toString(sol.intersection(case1, case2)));
    }
}
