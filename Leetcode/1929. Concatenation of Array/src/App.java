import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an integer array nums of length n, you want to create an array ans of length 
         * 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
         * Specifically, ans is the concatenation of two nums arrays.
         * 
         * Return the array ans.
         * 
         * Example:
         * Input: nums = [1,2,1]
         * Output: [1,2,1,1,2,1]
         */
        
        Solution sol = new Solution();

        int[] case1 = new int[]{1, 2, 1};
        int[] case2 = new int[]{1, 3, 2, 1};

        System.out.println(Arrays.toString(sol.getConcatenation(case1)));
        System.out.println(Arrays.toString(sol.getConcatenation(case2)));
    }
}
