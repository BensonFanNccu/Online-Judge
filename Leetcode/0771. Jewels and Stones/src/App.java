public class App {
    public static void main(String[] args) throws Exception {
        /*
         * You're given strings jewels representing the types of stones that are jewels, 
         * and stones representing the stones you have. 
         * Each character in stones is a type of stone you have. 
         * You want to know how many of the stones you have are also jewels.
         * 
         * Letters are case sensitive, so "a" is considered a different type of stone from "A".
         * 
         * Example:
         * Input: jewels = "aA", stones = "aAAbbbb"
         * Output: 3
         */

        Solution sol = new Solution();

        System.out.println(sol.numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(sol.numJewelsInStones2("z", "ZZ"));
    }
}
