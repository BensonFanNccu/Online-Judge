public class App {
    public static void main(String[] args) throws Exception {
        /*
         * You are given a string s consisting of lowercase English letters. 
         * A duplicate removal consists of choosing two adjacent and 
         * equal letters and removing them.
         * 
         * We repeatedly make duplicate removals on s until we no longer can.
         * 
         * Return the final string after all such duplicate removals have been made. 
         * It can be proven that the answer is unique.
         * 
         * Example:
         * Input: s = "abbaca"
         * Output: "ca"
         */
        
        Solution sol = new Solution();

        String case1 = "abbaca";
        String case2 = "azxxzy";

        System.out.println(sol.removeDuplicates(case1));
        System.out.println(sol.removeDuplicates(case2));
    }
}
