public class Solution {
    public boolean repeatedSubstringPattern(String s){
        /*
         * Divisor Solution
         * Time: O(N*sqrt(N))
         * Space: O(N)
         */

        int n = s.length();

        for(int i = 1; i <= n / 2; i++){
            if(n % i == 0){
                StringBuilder sb = new StringBuilder();

                for(int j = 0; j < n / i; j++) sb.append(s.substring(0, i));

                if(s.equals(sb.toString())) return true;
            } 
        }

        return false;
    }


    public boolean repeatedSubstringPattern2(String s){
        /*
         * String Concatenation Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        String ans = s + s;

        if(ans.substring(1, ans.length() - 1).contains(s)) return true;

        return false;
    }
}
