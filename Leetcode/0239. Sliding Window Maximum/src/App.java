import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
        /*
         * You are given an array of integers nums, 
         * there is a sliding window of size k which is moving from the very left 
         * of the array to the very right. 
         * You can only see the k numbers in the window. 
         * Each time the sliding window moves right by one position.
         * 
         * Return the max sliding window.
         * 
         * Example:
         * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
         * Output: [3,3,5,5,6,7]
         */
        
        Solution sol = new Solution();

        int[] case1 = new int[] {1, 3, -1, -3, 5, 3, 6, 7};
        int[] case2 = new int[] {1};

        System.out.println(Arrays.toString(sol.maxSlidingWindow(case1, 3)));
        System.out.println(Arrays.toString(sol.maxSlidingWindow(case2, 1)));
    }
}
