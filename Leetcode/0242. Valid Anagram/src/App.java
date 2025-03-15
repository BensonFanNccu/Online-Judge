public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
         * 
         * Example:
         * Input: s = "anagram", t = "nagaram"
         * Output: true
         */

        Solution sol = new Solution();

        String case1 = "anagram";
        String case2 = "nagaram";

        System.out.println(sol.isAnagram(case1, case2));
        System.out.println(sol.isAnagram2(case1, case2));
    }
}
