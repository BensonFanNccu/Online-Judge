import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an integer array nums and an integer val, 
         * remove all occurrences of val in nums in-place. 
         * The order of the elements may be changed. 
         * Then return the number of elements in nums which are not equal to val.
         * 
         * Consider the number of elements in nums which are not equal to val be k, 
         * to get accepted, you need to do the following things:
         * 1. Change the array nums such that the first k elements of nums contain 
         *    the elements which are not equal to val. 
         *    The remaining elements of nums are not important as well as the size of nums.
         * 
         * 2. Return k.
         */

        Solution sol = new Solution();

        int[] case1 = new int[] {3, 2, 2, 3};
        int[] case2 = new int[] {0, 1, 2, 2, 3, 0, 4, 2};

        System.out.print(sol.removeElement(case1, 3) + " ");
        System.out.println(Arrays.toString(case1));

        System.out.print(sol.removeElement2(case2, 2) + " ");
        System.out.println(Arrays.toString(case2));
    }
}
