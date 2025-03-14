public class Solution {
    public int mySqrt(int x){
        /*
         * Straight Forward Solution
         * Time: O(sqrt(N))
         * Space: O(1)
         */

        int ans = 0;

        while((long) ans * ans <= (long) x){
            if((long) ans * ans == (long) x) return ans;

            ans++;
        }

        return ans - 1;
    }

    
    public int mySqrt2(int x){
        /*
         * Binary Search Solution
         * Time: O(LogN)
         * Space: O(1)
         */
        
        int left = 0, right = x, mid;

        while(left <= right){
            mid = (left + right) / 2;

            if(mid * mid == x) return mid;
            if((long) mid * mid < (long) x) left = mid + 1;
            if((long) mid * mid > (long) x) right = mid - 1;
        }

        return right;
    }
}
