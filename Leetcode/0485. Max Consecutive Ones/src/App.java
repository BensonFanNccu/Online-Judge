public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given a binary array nums, return the maximum number of consecutive 1's in the array.
         * 
         * Example:
         * Input: nums = [1,1,0,1,1,1]
         * Output: 3
         */
        
        Solution sol = new Solution();

        int[] case1 = new int[] {1, 1, 0, 1, 1, 1};
        int[] case2 = new int[] {1, 0, 1, 1, 0, 1};

        System.out.println(sol.findMaxConsecutiveOnes(case1));
        System.out.println(sol.findMaxConsecutiveOnes(case2));
    }
}
