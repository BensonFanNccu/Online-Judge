import java.util.HashMap;
import java.util.Map;


public class Solution {
    public boolean canConstruct(String ransomNote, String magazine){
        /*
         * HashMap Solution
         * Time: O(M+N)
         * Space: O(N)
         */

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for(char m : magazine.toCharArray()) map.put(m, map.getOrDefault(m, 0) + 1);

        for(char r : ransomNote.toCharArray()){
            if(!map.containsKey(r) || map.get(r) <= 0) return false;

            map.put(r, map.get(r) - 1);
        }

        return true;
    }
    

    public boolean canConstruct2(String ransomNote, String magazine){
        /*
         * Array Solution
         * Time: O(M+N)
         * Space: O(N)
         */

        if(ransomNote.length() > magazine.length()) return false;

        int[] counter = new int[26];

        for(char m : magazine.toCharArray()) counter[m - 'a']++;
        for(char r : ransomNote.toCharArray()){
            if(counter[r - 'a'] == 0) return false;

            counter[r - 'a']--;
        }

        return true;
    }
}