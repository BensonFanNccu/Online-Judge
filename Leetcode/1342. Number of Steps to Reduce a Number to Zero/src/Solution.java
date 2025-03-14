public class Solution {
    public int numberOfSteps(int num){
        /*
         * Straight Forward Solution
         * Time: O(LogN)
         * Space: O(1)
         */
        
        int ans = 0;

        while(num != 0){
            if(num % 2 != 0) num--;
            else num /= 2;

            ans++; 
        }

        return ans;
    }
}
