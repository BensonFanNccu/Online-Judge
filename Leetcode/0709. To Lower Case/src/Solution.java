public class Solution {
    public String toLowerCase(String s){
        /*
         * ASCII Solution
         * Time: O(N)
         * Space: O(N)
         */

        String ans = "";

        for(int i = 0; i < s.length(); i++){
            int c = (int)s.charAt(i);

            if(c >= 65 && c <= 90) ans += (char)(c + 32);
            else ans += (char)c;
        }

        return ans;
    }


    public String toLowerCase2(String s){
        /*
         * Built-in Function Solution
         * Time: O(N)
         * Space: O(1)
         */
        
        return s.toLowerCase();
    }
}
