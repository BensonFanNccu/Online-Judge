import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given a zero-based permutation nums (0-indexed), 
         * build an array ans of the same length 
         * where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
         * 
         * A zero-based permutation nums is an array of distinct integers 
         * from 0 to nums.length - 1 (inclusive).
         * 
         * Example:
         * Input: nums = [0,2,1,5,3,4]
         * Output: [0,1,2,4,5,3]
         */
        
        Solution sol = new Solution();

        int[] case1 = new int[]{0, 2, 1, 5, 3, 4};
        int[] case2 = new int[]{5, 0, 1, 2, 3, 4};

        System.out.println(Arrays.toString(sol.buildArray(case1)));
        System.out.println(Arrays.toString(sol.buildArray2(case1)));
        System.out.println(Arrays.toString(sol.buildArray3(case2)));
    }
}
