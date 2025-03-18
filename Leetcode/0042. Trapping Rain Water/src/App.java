public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given n non-negative integers representing an elevation map 
         * where the width of each bar is 1, compute how much water it can trap after raining.
         * 
         * Example:
         * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
         * Output: 6
         */
        
        Solution sol = new Solution();

        int[] case1 = new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] case2 = new int[] {4, 2, 0, 3, 2, 5};

        System.out.println(sol.trap(case1));
        System.out.println(sol.trap2(case1));
        System.out.println(sol.trap3(case2));
    }
}
