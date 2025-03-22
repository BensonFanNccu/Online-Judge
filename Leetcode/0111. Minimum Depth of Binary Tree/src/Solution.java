import java.util.LinkedList;
import java.util.Queue;


public class Solution {
    public int minDepth(TreeNode root){
        /*
         * BFS Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        Queue<TreeNode> queue = new LinkedList<>();
        int ans = 1;

        if(root == null) return 0;

        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();

                if(node.left == null && node.right == null) return ans;
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }

            ans++;
        }

        return -1;
    }
}
