import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given an integer n, return a string array answer (1-indexed) where:
         * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
         * answer[i] == "Fizz" if i is divisible by 3.
         * answer[i] == "Buzz" if i is divisible by 5.
         * answer[i] == i (as a string) if none of the above conditions are true.
         * 
         * Example:
         * Input: n = 3
         * Output: ["1","2","Fizz"]
         */

        Solution sol = new Solution();

        String[] case1 = sol.fizzBuzz(3).toArray(new String[0]);
        String[] case2 = sol.fizzBuzz(5).toArray(new String[0]);
        String[] case3 = sol.fizzBuzz(15).toArray(new String[0]);

        System.out.println(Arrays.toString(case1));
        System.out.println(Arrays.toString(case2));
        System.out.println(Arrays.toString(case3));
    }
}
