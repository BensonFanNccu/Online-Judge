import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an integer array nums sorted in non-decreasing order, 
         * return an array of the squares of each number sorted in non-decreasing order.
         * 
         * Example: 
         * Input: nums = [-4,-1,0,3,10]
         * Output: [0,1,9,16,100]
         */

        Solution sol = new Solution();

        int[] case1 = new int[] {-4, -1, 0, 3, 10};
        int[] case2 = new int[] {-7, -3, 2, 3, 11};

        System.out.println(Arrays.toString(sol.sortedSquares(case1)));
        System.out.println(Arrays.toString(sol.sortedSquares(case2)));
    }
}
