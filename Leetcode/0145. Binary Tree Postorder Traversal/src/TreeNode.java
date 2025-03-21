public class TreeNode {
    int val;
    TreeNode left, right;


    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }


    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    
    public TreeNode(int[] nums, int index){
        if (index >= nums.length) return;
        
        this.val = nums[index];

        if (2 * index + 1 < nums.length) this.left = new TreeNode(nums, 2 * index + 1);
        if (2 * index + 2 < nums.length) this.right = new TreeNode(nums, 2 * index + 2);
    }
}

