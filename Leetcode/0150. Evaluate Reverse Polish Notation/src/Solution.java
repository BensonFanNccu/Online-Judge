import java.util.Stack;


public class Solution {
    public int evalRPN(String[] tokens){
        /*
         * Stack Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        Stack<Integer> s = new Stack<>();
        int temp;

        for(int i = 0; i < tokens.length; i++){
            switch(tokens[i]){
                case "+":
                    s.push(s.pop() + s.pop());
                    break;
                case "-":
                    temp = s.pop();

                    s.push(s.pop() - temp);
                    break;
                case "*":
                    s.push(s.pop() * s.pop());
                    break;
                case "/":
                    temp = s.pop();
                    
                    s.push(s.pop() / temp);
                    break;
                default:
                    s.push(Integer.parseInt(tokens[i]));
            }
        }

        return s.pop();
    }
}
