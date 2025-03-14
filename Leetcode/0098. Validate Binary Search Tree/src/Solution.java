public class Solution {
    public boolean isValidBST(TreeNode root){
        /*
         * Traversal Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        return isValid(root, null, null);
    }


    public boolean isValid(TreeNode root, Integer min, Integer max){
        if(root == null) return true;
        if((min != null && root.val <= min) || (max != null) && root.val >= max) return false;

        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
    }
}
