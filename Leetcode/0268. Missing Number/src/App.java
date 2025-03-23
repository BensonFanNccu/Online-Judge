public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an array nums containing n distinct numbers in the range [0, n], 
         * return the only number in the range that is missing from the array.
         * 
         * Example:
         * Input: nums = [3,0,1]
         * Output: 2
         */
        
        Solution sol = new Solution();

        int[] case1 = new int[] {3, 0, 1};
        int[] case2 = new int[] {0, 1};

        System.out.println(sol.missingNumber(case1));
        System.out.println(sol.missingNumber(case2));
    }
}
