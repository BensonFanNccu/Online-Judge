public class Solution {
    public int numOfSubarrays(int[] arr){
        /*
         * Prefix Sum Solution
         * Time: O(N)
         * Space: O(1)
         */
        
        int mod = 1000000007, odd = 0, even = 1, ans = 0, sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

            if(sum % 2 == 1){
                ans = (ans + even) % mod;
                odd++;
            }else{
                ans = (ans + odd) % mod;
                even++;
            }
        }

        return ans;
    }
}
