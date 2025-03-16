public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given a string s and an integer k, reverse the first k characters for 
         * every 2k characters counting from the start of the string.
         * 
         * If there are fewer than k characters left, reverse all of them. 
         * If there are less than 2k but greater than or equal to k characters, 
         * then reverse the first k characters and leave the other as original.
         * 
         * Example:
         * Input: s = "abcdefg", k = 2
         * Output: "bacdfeg"
         */
        
        Solution sol = new Solution();

        String case1 = "abcdefg";
        String case2 = "abcd";

        System.out.println(sol.reverseStr(case1, 2));
        System.out.println(sol.reverseStr(case2, 2));
    }
}
