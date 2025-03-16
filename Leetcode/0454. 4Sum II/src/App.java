public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given four integer arrays nums1, nums2, nums3, and nums4 all of length n, 
         * return the number of tuples (i, j, k, l) such that:
         * 1. 0 <= i, j, k, l < n
         * 2. nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
         */

        Solution sol = new Solution();

        int[] case1 = new int[] {1, 2};
        int[] case2 = new int[] {-2, -1};
        int[] case3 = new int[] {-1, 2};
        int[] case4 = new int[] {0, 2};

        System.out.println(sol.fourSumCount(case1, case2, case3, case4));
    }
}
