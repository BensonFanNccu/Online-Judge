import java.util.Stack;


public class Solution {
    public String removeDuplicates(String s){
        /*
         * StringBuilder Solution
         * Time: O(N)
         * Space: O(N)
         */

        StringBuilder sb = new StringBuilder();
        int top = -1;

        for(char c: s.toCharArray()){
            if(top >= 0 && sb.charAt(top) == c) sb.deleteCharAt(top--);
            else{
                sb.append(c);
                top++;
            } 
        }

        return sb.toString();
    }


    public String removeDuplicates2(String s){
        /*
         * Stack Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        Stack<Character> stack = new Stack<>();
        Stack<Character> rev = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char c: s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == c) stack.pop();
            else stack.push(c);
        }

        while(!stack.isEmpty()) rev.push(stack.pop());
        while(!rev.isEmpty()) sb.append(rev.pop());

        return sb.toString();
    }
}
