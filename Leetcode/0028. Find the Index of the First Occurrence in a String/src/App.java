public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Given two strings needle and haystack, 
         * return the index of the first occurrence of needle in haystack, 
         * or -1 if needle is not part of haystack.
         * 
         * Example:
         * Input: haystack = "sadbutsad", needle = "sad"
         * Output: 0
         */
        
        Solution sol = new Solution();

        String case1 = "sadbutsad";
        String case2 = "sad";

        System.out.println(sol.strStr(case1, case2));
        System.out.println(sol.strStr2(case1, case2));
    }
}
