import java.util.ArrayList;
import java.util.List;


class Solution {
    public List<Integer> preorderTraversal(TreeNode root){
        /*
         * Recursion Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        List<Integer> ans = new ArrayList<>();

        preorder(root, ans);

        return ans;
    }


    public void preorder(TreeNode root, List<Integer> ans){
        if(root == null) return;

        ans.add(root.val);
        preorder(root.left, ans);
        preorder(root.right, ans);
    }
}
