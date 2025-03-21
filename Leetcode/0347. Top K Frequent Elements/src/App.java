import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an integer array nums and an integer k, return the k most frequent elements. 
         * You may return the answer in any order.
         * 
         * Example:
         * Input: nums = [1,1,1,2,2,3], k = 2
         * Output: [1,2]
         */
        
        Solution sol = new Solution();

        int[] case1 = new int[] {1, 1, 1, 2, 2, 3};
        int[] case2 = new int[] {1};

        System.out.println(Arrays.toString(sol.topKFrequent(case1, 2)));
        System.out.println(Arrays.toString(sol.topKFrequent(case2, 1)));
    }
}
