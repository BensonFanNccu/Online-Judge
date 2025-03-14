public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
         * determine if the input string is valid.
         * 
         * An input string is valid if:
         * 1. Open brackets must be closed by the same type of brackets.
         * 2. Open brackets must be closed in the correct order.
         * 3. Every close bracket has a corresponding open bracket of the same type.
         * 
         * Example: 
         * Input: s = "()"
         * Output: true
         */
        
        Solution sol = new Solution();

        String case1 = "()[]{}";
        String case2 = "(]";
        String case3 = "{[[]]}";

        System.out.println(sol.isValid(case1));
        System.out.println(sol.isValid(case2));
        System.out.println(sol.isValid(case3));
    }
}
