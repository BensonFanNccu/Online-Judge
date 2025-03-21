import java.util.ArrayList;
import java.util.List;


public class Solution {
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();

        postorder(root, ans);

        return ans;
    }


    public void postorder(TreeNode root, List<Integer> ans){
        if(root == null) return;

        postorder(root.left, ans);
        postorder(root.right, ans);
        ans.add(root.val);
    }
}
