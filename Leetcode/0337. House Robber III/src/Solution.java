public class Solution {
    public int rob(TreeNode root){
        /*
         * DP Solution
         * Time: O(N)
         * Space: O(N)
         */

        int[] ans = getChild(root);

        return Math.max(ans[0], ans[1]);
    }


    public int[] getChild(TreeNode root){
        if(root == null) return new int[2];

        int[] res = new int[2];
        int[] left = getChild(root.left);
        int[] right = getChild(root.right);

        res[0] = root.val + left[1] + right[1];
        res[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return res;
    }
}
