public class App {
    public static void main(String[] args) throws Exception {
        /*
         * You are given an integer array nums consisting of 2 * n integers.
         * You need to divide nums into n pairs such that:
         * 1. Each element belongs to exactly one pair.
         * 2. The elements present in a pair are equal.
         * 
         * Return true if nums can be divided into n pairs, otherwise return false.
         * 
         * Example:
         * Input: nums = [3,2,3,2,2,2]
         * Output: true
         */
        
        Solution sol = new Solution();

        int[] case1 = new int[] {3, 2, 3, 2, 2, 2};
        int[] case2 = new int[] {1, 2, 3, 4};

        System.out.println(sol.divideArray(case1));
        System.out.println(sol.divideArray(case2));
    }
}
