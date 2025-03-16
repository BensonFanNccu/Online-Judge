import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target){
        /*
         * Two Pointers Solution
         * Time: O(N^3)
         * Space: O(1)
         */

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0 && nums[i] > target) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] >= 0 && nums[i] + nums[j] > target) break;
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1, right = nums.length - 1;

                while(left < right){
                    long sum = (long)nums[i] + nums[j] + nums[right] + nums[left];

                    if(sum > target) right--;
                    else if(sum < target) left++;
                    else{
                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while (right > left && nums[right] == nums[right - 1]) right--;
                        while (right > left && nums[left] == nums[left + 1]) left++;

                        right--;
                        left++;
                    }
                }
            }
        }

        return ans;
    }
}
