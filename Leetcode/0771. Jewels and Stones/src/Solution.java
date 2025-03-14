import java.util.HashSet;
import java.util.Set;


public class Solution {
    public int numJewelsInStones(String jewels, String stones){
        /*
         * Straight Forward Solution
         * Time: O(M*N)
         * Space: O(1)
         */

        int ans = 0;

        for(char j : jewels.toCharArray()){
            for(char s : stones.toCharArray()){
                if(j == s) ans++;
            }
        }

        return ans;
    }


    public int numJewelsInStones2(String jewels, String stones){
        /*
         * HashSet Solution
         * Time: O(M+N)
         * Space: O(N)
         */
        
        Set<Character> jset = new HashSet<Character>();
        int ans = 0;

        for(char j : jewels.toCharArray()) jset.add(j);
        for(char s : stones.toCharArray()){
            if(jset.contains(s)) ans++;
        }

        return ans;
    }
}