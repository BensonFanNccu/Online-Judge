public class Solution {
    public int strStr(String haystack, String needle){
        /*
         * Built-in Solution
         * Time: O(N*M)
         * Space: O(1)
         */

        return haystack.indexOf(needle);
    }


    public int strStr2(String haystack, String needle){
        /*
         * Sliding Window Solution
         * Time: O(N*M)
         * Space: O(1)
         */
        
        int n = haystack.length(), m = needle.length();

        for(int i = 0; i <= n - m; i++){
            int j = 0;

            while(j < m && haystack.charAt(i + j) == needle.charAt(j)) j++;

            if(j == m) return i;
        }

        return -1;
    }
}
