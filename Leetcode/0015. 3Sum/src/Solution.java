import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution {
    public List<List<Integer>> threeSum(int[] nums){
        /*
         * Two Pointers Solution
         * Time: O(N^2)
         * Space: O(1)
         */
        
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] > 0) return ans;
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum > 0) right--;
                else if(sum < 0) left++;
                else{
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (right > left && nums[right] == nums[right - 1]) right--;
                    while (right > left && nums[left] == nums[left + 1]) left++;

                    right--;
                    left++;
                }
            }
        }

        return ans;
    }
}
