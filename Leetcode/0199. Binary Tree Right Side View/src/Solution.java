import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Solution {
    public List<Integer> rightSideView(TreeNode root){
        /*
         * BFS Solution
         * Time: O(N)
         * Space: O(N)
         */

        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) return ans;

        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode node = null;
            int size = queue.size();

            for(int i = 0; i < size; i++){
                node = queue.poll();

                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }

            ans.add(node.val);
        }

        return ans;
    }
}
