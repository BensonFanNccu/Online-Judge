import java.util.Stack;


public class Solution {
    public String simplifyPath(String path){
        /*
         * Stack Solution
         * Time: O(N)
         * Space: O(N)
         */

        Stack<String> stack = new Stack<>();
        String[] segments = path.split("/");
        StringBuilder sb = new StringBuilder();

        for(String segment: segments){
            if(segment.equals(".") || segment.isEmpty()) continue;
            else if(segment.equals("..")){
                if(!stack.isEmpty()) stack.pop();
            }else{
                stack.add(segment);
            }
        }

        for(String dir: stack){
            sb.append("/");
            sb.append(dir);
        }

        if(sb.length() > 0) return sb.toString();
        else return "/";
    }
}
