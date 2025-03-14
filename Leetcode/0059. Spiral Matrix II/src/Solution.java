public class Solution {
    public int[][] generateMatrix(int n){
        /*
         * Simulation Solution
         * Time: O(N*2)
         * Space: O(N*2)
         */

        int[][] ans = new int[n][n];
        int epoch = n / 2, offset = 1, count = 1, x = 0, y = 0;

        while(epoch > 0){
            int i = x, j = y;

            for(; i < n - offset; i++) ans[j][i] = count++;
            for(; j < n - offset; j++) ans[j][i] = count++;
            for(; i > x; i--) ans[j][i] = count++;
            for(; j > y; j--) ans[j][i] = count++;

            x++;
            y++;
            offset++;
            epoch--;
        }

        if(n % 2 == 1) ans[n / 2][n / 2] = n * n;

        return ans;
    }
}
