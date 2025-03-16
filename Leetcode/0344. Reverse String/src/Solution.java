public class Solution {
    public void reverseString(char[] s){
        /*
         * Two Pointers Solution
         * Time: O(N)
         * Space: O(1)
         */
        
        int left = 0, right = s.length - 1;
        char c;

        while(right > left){
            c = s[left];
            s[left] = s[right];
            s[right] = c;
            
            left++;
            right--;
        }
    }
}
