public class Solution {
    public String removeOuterParentheses(String s){
        /*
         * Straight Forward Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        StringBuilder sb = new StringBuilder();
        int counter = 0;

        for(char c : s.toCharArray()){
            if(c == '(' && counter++ > 0) sb.append(c);
            else if(c == ')' && counter-- > 1) sb.append(c);
        }

        return sb.toString();
    }
}
