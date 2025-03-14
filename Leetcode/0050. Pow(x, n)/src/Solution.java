public class Solution {
    public double myPow(double x, int n){
        /*
         * Binary Exponentiation Solution
         * Time: O(LogN)
         * Space: O(LogN)
         */
        
        return exp(x, (long) n);
    }

    
    public double exp(double x, long n){
        if(n == 0) return 1.0;
        if(n < 0) return 1.0 / exp(x, -1 * n);
        if(n % 2 == 1) return x * exp(x * x, n  / 2);

        return exp(x * x, n / 2);
    }
}