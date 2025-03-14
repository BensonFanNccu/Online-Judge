import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an array of integers nums and an integer target, 
         * return indices of the two numbers such that they add up to target.
         * 
         * Example:
         * Input: nums = [2,7,11,15], target = 9
         * Output: [0,1]
         * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
         */
        
        Solution sol = new Solution();

        int[] testCase1 = new int[] {2, 7, 11, 15};
        int[] testCase2 = new int[] {3, 2, 4};
        int[] testCase3 = new int[] {3, 3};

        System.out.println(Arrays.toString(sol.twoSum(testCase1, 9)));
        System.out.println(Arrays.toString(sol.twoSum2(testCase2, 6)));
        System.out.println(Arrays.toString(sol.twoSum(testCase3, 6)));
    }
}
