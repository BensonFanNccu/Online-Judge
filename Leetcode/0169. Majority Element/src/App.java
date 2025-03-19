public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an array nums of size n, return the majority element.
         * 
         * The majority element is the element that appears more than ⌊n / 2⌋ times. 
         * You may assume that the majority element always exists in the array.
         * 
         * Example:
         * Input: nums = [3,2,3]
         * Output: 3
         */
        
        Solution sol = new Solution();

        int[] case1 = new int[] {3, 2, 3};
        int[] case2 = new int[] {2, 2, 1, 1, 1, 2, 2};

        System.out.println(sol.majorityElement(case1));
        System.out.println(sol.majorityElement(case2));
    }
}
