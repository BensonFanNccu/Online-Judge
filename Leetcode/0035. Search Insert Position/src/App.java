public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given a sorted array of distinct integers and a target value, 
         * return the index if the target is found. 
         * If not, return the index where it would be if it were inserted in order.
         * 
         * Example:
         * Input: nums = [1,3,5,6], target = 5
         * Output: 2
         */

        Solution sol = new Solution();

        int[] testCase = new int[] {1,3,5,6};

        System.out.println(sol.searchInsert(testCase, 5));
        System.out.println(sol.searchInsert2(testCase, 2));
        System.out.println(sol.searchInsert(testCase, 7));
    }
}
