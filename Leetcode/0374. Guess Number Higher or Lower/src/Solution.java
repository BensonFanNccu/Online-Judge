public class Solution {
    int num;


    public void random(int n){
        num = (int)Math.random() * n + 1;
    }


    public int guess(int guess){
        if(guess == num) return 0;
        else if(guess > num) return -1;
        else return 1;
    }
    

    public int guessNumber(int n){
        /*
         * Binary Search Solution
         * Time: O(LogN)
         * Space: O(1)
         */
        
        int low = 0, high = n, mid = 0;

        random(n);

        while(low <= high){
            mid = low + (high - low) / 2;

            if(guess(mid) == 0) return mid;
            else if(guess(mid) == -1) high = mid - 1;
            else if(guess(mid) == 1) low = mid + 1;
        }

        return -1;
    }
}
