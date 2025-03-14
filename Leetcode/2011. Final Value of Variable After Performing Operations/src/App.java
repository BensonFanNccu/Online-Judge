public class App {
    public static void main(String[] args) throws Exception {
        /*
         * There is a programming language with only four operations and one variable X:
         * ++X and X++ increments the value of the variable X by 1.
         * --X and X-- decrements the value of the variable X by 1.
         * Initially, the value of X is 0.
         * 
         * Given an array of strings operations containing a list of operations, 
         * return the final value of X after performing all the operations.
         * 
         * Example:
         * Input: operations = ["--X","X++","X++"]
         * Output: 1
         */
        
        Solution sol = new Solution();

        String[] case1 = new String[] {"--X", "X++", "X++"};
        String[] case2 = new String[] {"++X", "++X", "X++"};
        String[] case3 = new String[] {"X++", "++X", "--X", "X--"};

        System.out.println(sol.finalValueAfterOperations(case1));
        System.out.println(sol.finalValueAfterOperations(case2));
        System.out.println(sol.finalValueAfterOperations(case3));
    }
}
