public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an array of integers nums, return the number of good pairs.
         * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
         */
        
        Solution sol = new Solution();

        int[] case1 = new int[] {1, 2, 3, 1, 1, 3};
        int[] case2 = new int[] {1, 1, 1, 1};

        System.out.println(sol.numIdenticalPairs(case1));
        System.out.println(sol.numIdenticalPairs(case2));
    }
}
