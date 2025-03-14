import java.util.LinkedList;
import java.util.Queue;


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


    public void printTree(){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(this); 

        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");

            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
    }
}