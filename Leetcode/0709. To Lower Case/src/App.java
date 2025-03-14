public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given a string s, return the string after replacing every uppercase letter 
         * with the same lowercase letter.
         * 
         * Example:
         * Input: s = "Hello"
         * Output: "hello"
         */
        
        Solution sol = new Solution();

        String case1 = "HeLLo WoRld";
        String case2 = "lEeTcOdE";
        String case3 = "lOwErCaSE";

        System.out.println(sol.toLowerCase(case1));
        System.out.println(sol.toLowerCase(case2));
        System.out.println(sol.toLowerCase(case3));
    }
}
