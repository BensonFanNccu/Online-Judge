import java.util.Stack;


public class Solution {
    public boolean isValid(String s){
        /*
         * Stack Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '(' || c == '[' || c == '{') stack.push(c);

            if(stack.isEmpty()) return false;

            if(c == ')' && stack.pop() != '(') return false;
            if(c == ']' && stack.pop() != '[') return false;
            if(c == '}' && stack.pop() != '{') return false;
        }

        return stack.isEmpty();
    }
}
