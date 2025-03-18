public class App {
    public static void main(String[] args) throws Exception {
        /*
         * You are given an array of strings tokens that represents an arithmetic expression 
         * in a Reverse Polish Notation.
         * Evaluate the expression. 
         * Return an integer that represents the value of the expression.
         * 
         * Example:
         * Input: tokens = ["2","1","+","3","*"]
         * Output: 9
         */

        Solution sol = new Solution();

        String[] case1 = new String[] {"2", "1", "+", "3", "*"};
        String[] case2 = new String[] {"4", "13", "5", "/", "+"};

        System.out.println(sol.evalRPN(case1));
        System.out.println(sol.evalRPN(case2));
    }
}
