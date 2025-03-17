public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given a string s, check if it can be constructed by taking a substring of 
         * it and appending multiple copies of the substring together.
         * 
         * Example:
         * Input: s = "abab"
         * Output: true
         */

        Solution sol = new Solution();

        String case1 = "abab";
        String case2 = "aba";

        System.out.println(sol.repeatedSubstringPattern(case1));
        System.out.println(sol.repeatedSubstringPattern(case2));
    }
}
