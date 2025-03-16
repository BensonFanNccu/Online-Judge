public class Solution {
    public String reverseStr(String s, int k) {
        /*
         * Stright Forward Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        char[] c = s.toCharArray();
        char temp;

        for(int i = 0; i < c.length; i += 2 * k){
            int start = i, end = Math.min(i + k - 1, c.length - 1);

            while(start < end){
                temp = c[start];
                c[start++] = c[end];
                c[end--] = temp;
            }
        }

        return String.valueOf(c);
    }
}
