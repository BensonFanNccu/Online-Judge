public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given a positive integer n, 
         * write a function that returns the number of set bits in 
         * its binary representation (also known as the Hamming weight).
         * 
         * Example:
         * Input: n = 11
         * Output: 3
         * Explanation: The input binary string 1011 has a total of three set bits.
         */
        
        Solution sol = new Solution();

        int case1 = 5;
        int case2 = 35;
        int case3 = 128;

        System.out.println(sol.hammingWeight(case1));
        System.out.println(sol.hammingWeight2(case2));
        System.out.println(sol.hammingWeight(case3));
    }
}
