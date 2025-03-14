public class App {
    public static void main(String[] args) throws Exception {
        /*
         * You are given a string title consisting of one or more words separated by a single 
         * space, where each word consists of English letters. 
         * 
         * Capitalize the string by changing the capitalization of each word such that:
         * If the length of the word is 1 or 2 letters, change all letters to lowercase.
         * Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
         * 
         * Return the capitalized title.
         * 
         * Example:
         * Input: title = "capiTalIze tHe titLe"
         * Output: "Capitalize The Title"
         */
        
        Solution sol = new Solution();

        String case1 = "capiTalIze tHe titLe";
        String case2 = "First leTTeR of EACH Word";
        String case3 = "i lOve leetcode";

        System.out.println(sol.capitalizeTitle(case1));
        System.out.println(sol.capitalizeTitle2(case2));
        System.out.println(sol.capitalizeTitle2(case3));
    }
}
