import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Solution {
    public String reverseWords(String s){
        /*
         * Built-in Function Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        List<String> wList = Arrays.asList(s.trim().split("\\s+"));

        Collections.reverse(wList);

        return String.join(" ", wList);
    }


    public String reverseWords2(String s){
        /*
         * Straight Forward Solution
         * Time: O(N)
         * Space: O(N)
         */

        StringBuilder sb = removespace(s);

        reverse(sb, 0, sb.length() - 1);
        reverseSB(sb);

        return sb.toString();
    }


    public StringBuilder removespace(String s){
        StringBuilder sb = new StringBuilder();
        int start = 0, end = s.length() - 1;

        while(s.charAt(start) == ' ') start++;
        while(s.charAt(end) == ' ') end--;
        while(start <= end){
            char c = s.charAt(start);

            if(c != ' ' || sb.charAt(sb.length() - 1) != ' ') sb.append(c);

            start++;
        }

        return sb;
    }


    public void reverse(StringBuilder sb, int start, int end){
        char temp;
        
        while(start < end){
            temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);

            start++;
            end--;
        }
    }


    public void reverseSB(StringBuilder sb){
        int start = 0, end = 1, size = sb.length();

        while(start < size){
            while(end < size && sb.charAt(end) != ' ') end++;

            reverse(sb, start, end - 1);
            start = end + 1;
            end = start + 1;
        }
    }
}
