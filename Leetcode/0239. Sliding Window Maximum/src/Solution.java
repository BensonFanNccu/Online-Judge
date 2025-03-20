import java.util.ArrayDeque;


public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k){
        /*
         * Straight Forward Solution(TLE)
         * Time: O(N*K)
         * Space: O(1)
         */
        
        int[] ans = new int[nums.length - k + 1];
        int max;

        for(int i = 0; i < nums.length - k + 1; i++){
            max = Integer.MIN_VALUE;

            for(int j = i; j < i + k; j++){
                max = Math.max(max, nums[j]);
            }

            ans[i] = max;
        }

        return ans;
    }


    public int[] maxSlidingWindow2(int[] nums, int k){
        /*
         * Monotonic Stack Solution
         * Time: O(N)
         * Space: O(k)
         */
        
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        int[] ans = new int[nums.length - k + 1];
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            while(!deque.isEmpty() && deque.peek() < (i - k + 1)) deque.poll();
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) deque.pollLast();

            deque.offer(i);

            if(i >= k - 1) ans[index++] = nums[deque.peek()];
        }

        return ans;
    }
}
