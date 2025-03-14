public class App {
    public static void main(String[] args) throws Exception {
        /*
         * You are given a string s. 
         * The score of a string is defined as the 
         * sum of the absolute difference between the ASCII values of adjacent characters.
         * 
         * Return the score of s.
         * 
         * Example:
         * Input: s = "hello"
         * Output: 13
         */
        
        Solution sol = new Solution();

        String case1 = "hello";
        String case2 = "happy";

        System.out.println(sol.scoreOfString(case1));
        System.out.println(sol.scoreOfString(case2));
    }
}
