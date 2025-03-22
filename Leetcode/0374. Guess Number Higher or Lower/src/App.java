public class App {
    public static void main(String[] args) throws Exception {
        /*
         * We are playing the Guess Game. The game is as follows:
         * 1. I pick a number from 1 to n. You have to guess which number I picked.
         * 2. Every time you guess wrong, I will tell you whether the number 
         *    I picked is higher or lower than your guess.
         * 
         * You call a pre-defined API int guess(int num), which returns three possible results:
         * 1. -1: Your guess is higher than the number I picked (i.e. num > pick).
         * 2. 1: Your guess is lower than the number I picked (i.e. num < pick).
         * 3. 0: your guess is equal to the number I picked (i.e. num == pick).
         * 
         * Return the number that I picked.
         * 
         * Example:
         * Input: n = 10, pick = 6
         * Output: 6
         */

        Solution sol = new Solution();

        System.out.println(sol.guessNumber(10));
    }
}
