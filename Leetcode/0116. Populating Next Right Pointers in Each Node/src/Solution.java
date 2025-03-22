import java.util.LinkedList;
import java.util.Queue;


public class Solution {
    public Node connect(Node root){
        /*
         * BFS Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        Queue<Node> queue = new LinkedList<>();

        if(root == null) return root;

        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            Node cur = queue.poll();

            if(cur.left != null) queue.offer(cur.left);
            if(cur.right != null) queue.offer(cur.right);

            for(int i = 1; i < size; i++){
                Node node = queue.poll();

                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);

                cur.next = node;
                cur = node;
            }
        }

        return root;
    }
}
