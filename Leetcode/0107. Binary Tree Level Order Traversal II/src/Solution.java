import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        /*
         * Iterative Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) return ans;

        queue.offer(root);

        while(!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size = queue.size();

            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();

                temp.add(node.val);

                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }

            ans.add(temp);
        }

        Collections.reverse(ans);

        return ans; 
    }
}
