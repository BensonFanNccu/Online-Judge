public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given two strings ransomNote and magazine, return true if ransomNote can be 
         * constructed by using the letters from magazine and false otherwise.
         * 
         * Each letter in magazine can only be used once in ransomNote.
         * 
         * Example:
         * Input: ransomNote = "a", magazine = "b"
         * Output: false
         */
        
        Solution sol = new Solution();

        System.out.println(sol.canConstruct("a", "b"));
        System.out.println(sol.canConstruct("aa", "ab"));
        System.out.println(sol.canConstruct("aa", "aab"));
    }
}
