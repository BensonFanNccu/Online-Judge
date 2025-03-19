public class App {
    public static void main(String[] args) throws Exception {
        /*
         * You are given a binary array nums.
         * 
         * You can do the following operation on the array any 
         * number of times (possibly zero):
         * 1. Choose any 3 consecutive elements from the array and flip all of them.
         * 2. Flipping an element means changing its value from 0 to 1, and from 1 to 0.
         * 
         * Return the minimum number of operations required to 
         * make all elements in nums equal to 1. If it is impossible, return -1.
         * 
         * Example:
         * Input: nums = [0,1,1,1,0,0]
         * Output: 3
         */

        Solution sol = new Solution();

        int[] case1 = new int[] {0, 1, 1, 1, 0, 0};
        int[] case2 = new int[] {0, 1, 1, 1};

        System.out.println(sol.minOperations(case1));
        System.out.println(sol.minOperations(case2));
    }
}
