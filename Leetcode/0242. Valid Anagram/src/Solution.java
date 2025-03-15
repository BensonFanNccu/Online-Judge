import java.util.Arrays;


public class Solution {
    public boolean isAnagram(String s, String t){
        /*
         * Sorting Solution
         * Time: O(N*LogN)
         * Space: O(N)
         */

        if(s.length() != t.length()) return false;

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        for(int i = 0; i < s.length(); i++){
            if(sChar[i] != tChar[i]) return false;
        }

        return true;
    }


    public boolean isAnagram2(String s, String t){
        /*
         * Frequency Table Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        int[] table = new int[26];

        for(char c: s.toCharArray()) table[c - 'a']++;
        for(char c: t.toCharArray()) table[c - 'a']--;
        
        for(int num: table){
            if(num != 0) return false;
        }
        
        return true;
    }
}
