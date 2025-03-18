public class App {
    public static void main(String[] args) throws Exception {
        /*
         * You are given an integer array height of length n. 
         * There are n vertical lines drawn such that the two endpoints of the 
         * ith line are (i, 0) and (i, height[i]).
         * Find two lines that together with the x-axis form a container, 
         * such that the container contains the most water.
         * 
         * Return the maximum amount of water a container can store.
         * 
         * Notice that you may not slant the container.
         */
        
        Solution sol = new Solution();

        int[] case1 = new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] case2 = new int[] {1, 1};

        System.out.println(sol.maxArea(case1));
        System.out.println(sol.maxArea(case2));
    }
}
