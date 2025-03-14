import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given a positive integer n, generate an n x n matrix filled 
         * with elements from 1 to n2 in spiral order.
         * 
         * Example:
         * Input: n = 3
         * Output: [[1,2,3],[8,9,4],[7,6,5]]
         */
        
        Solution sol = new Solution();

        System.out.println(Arrays.deepToString(sol.generateMatrix(3)));
        System.out.println(Arrays.deepToString(sol.generateMatrix(4)));
        System.out.println(Arrays.deepToString(sol.generateMatrix(5)));
    }
}
