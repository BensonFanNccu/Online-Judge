public class Solution {
    public boolean checkTree(TreeNode root){
        /*
         * Straight Forward Solution
         * Time: O(1)
         * Space: O(1)
         */
        
        return root.right.val + root.left.val == root.val;
    }
}
