import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Solution {
    public List<Double> averageOfLevels(TreeNode root){
        /*
         * BFS Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) return ans;

        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            double sum = 0;

            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();

                sum += node.val;

                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }

            ans.add(sum / size);
        }

        return ans;
    }
}
