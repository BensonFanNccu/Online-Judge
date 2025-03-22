import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Solution {
    public List<List<Integer>> levelOrder(Node root){
        /*
         * BFS Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        if(root == null) return ans;

        queue.offer(root);

        while(!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size = queue.size();

            for(int i = 0; i < size; i++){
                Node node = queue.poll();

                temp.add(node.val);

                for(Node child: node.children){
                    if(child != null) queue.offer(child);
                }
            }

            ans.add(temp);
        }

        return ans;
    }
}
