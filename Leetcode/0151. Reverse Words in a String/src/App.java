public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an input string s, reverse the order of the words.
         * 
         * A word is defined as a sequence of non-space characters. 
         * The words in s will be separated by at least one space.
         * 
         * Return a string of the words in reverse order concatenated by a single space.
         * 
         * Note that s may contain leading or trailing spaces or multiple spaces 
         * between two words. 
         * The returned string should only have a single space separating the words. 
         * Do not include any extra spaces.
         * 
         * Example:
         * Input: s = "the sky is blue"
         * Output: "blue is sky the"
         */
        
        Solution sol = new Solution();

        String case1 = "the sky is blue";
        String case2 = "  hello world  ";

        System.out.println(sol.reverseWords(case1));
        System.out.println(sol.reverseWords(case2));
    }
}
