import java.util.ArrayList;
import java.util.List;


public class Solution {
    public List<String> commonChars(String[] words) {
        /*
         * Frequency Table Solution
         * Time: O(M*N)
         * Space: O(1)
         */
        
        List<String> ans = new ArrayList<String>();
        int[] hash = new int[26];

        for(int i = 0; i < words[0].length(); i++) hash[words[0].charAt(i) - 'a']++;
        for(int i = 1; i < words.length; i++){
            int[] otherHash = new int[26];

            for(int j = 0; j < words[i].length(); j++) otherHash[words[i].charAt(j) - 'a']++;
            for(int j = 0; j < 26; j++) hash[j] = Math.min(hash[j], otherHash[j]);
        }

        for(int i = 0; i < 26; i++){
            while(hash[i] > 0){
                char c = (char)(i + 'a');

                ans.add(String.valueOf(c));
                hash[i]--;
            }
        }

        return ans;
    }
}
