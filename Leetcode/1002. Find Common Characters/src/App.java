public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given a string array words, return an array of all characters that 
         * show up in all strings within the words (including duplicates). 
         * You may return the answer in any order.
         * 
         * Example:
         * Input: words = ["bella","label","roller"]
         * Output: ["e","l","l"]
         */

        Solution sol = new Solution();

        String[] case1 = new String[] {"bella", "label", "roller"};
        String[] case2 = new String[] {"cool", "lock", "cook"};

        System.out.println(sol.commonChars(case1));
        System.out.println(sol.commonChars(case2));
    }
}
