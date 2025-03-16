import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Write a function that reverses a string. 
         * The input string is given as an array of characters s.
         * 
         * You must do this by modifying the input array in-place with O(1) extra memory.
         * 
         * Example:
         * Input: s = ["h","e","l","l","o"]
         * Output: ["o","l","l","e","h"]
         */
        
        Solution sol = new Solution();

        char[] case1 = new char[] {'h', 'e', 'l', 'l', 'o'};
        char[] case2 = new char[] {'h', 'a', 'n', 'n', 'a', 'h'};

        sol.reverseString(case1);
        sol.reverseString(case2);

        System.out.println(Arrays.toString(case1));
        System.out.println(Arrays.toString(case2));
    }
}
