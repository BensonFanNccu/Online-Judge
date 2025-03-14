import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an array nums. We define a running sum of an array 
         * as runningSum[i] = sum(nums[0]…nums[i]).
         * 
         * Return the running sum of nums.
         * 
         * Example:
         * Input: nums = [1,2,3,4]
         * Output: [1,3,6,10]
         */
        
        Solution sol = new Solution();

        int[] case1 = new int[] {1, 2, 3, 4};
        int[] case2 = new int[] {1, 1, 1, 1, 1};
        int[] case3 = new int[] {3, 1, 2, 10, 1};

        System.out.println(Arrays.toString(sol.runningSum(case1)));
        System.out.println(Arrays.toString(sol.runningSum(case2)));
        System.out.println(Arrays.toString(sol.runningSum(case3)));
    }
}
