import java.util.Arrays;


public class Solution {
    public int heightChecker(int[] heights){
        /*
         * Built-in Sort Solution
         * Time: O(N*LogN)
         * Space: O(N)
         */

        int ans = 0;
        int[] heights2 = Arrays.copyOf(heights, heights.length);

        Arrays.sort(heights2);

        for(int i = 0; i < heights.length; i++){
            if(heights[i] != heights2[i]) ans++;
        }

        return ans;
    }


    public int heightChecker2(int[] heights){
        /*
         * Counting Sort Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        int[] count = new int[101];
        int ans = 0, j = 0;

        for(int height : heights) count[height]++;

        for(int i = 0; i < heights.length; i++){
            while(j < count.length && count[j] == 0) j++;

            if(heights[i] != j) ans++;

            count[j]--;
        }

        return ans;
    }
}
