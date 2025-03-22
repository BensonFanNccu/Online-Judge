import java.util.HashMap;
import java.util.Map;


public class Solution {
    public int countCompleteComponents(int n, int[][] edges){
        /*
         * Disjoint Set Solution
         * Time: O(N)
         * Space: O(N)
         */

        UnionFind dsu = new UnionFind(n);
        Map<Integer, Integer> edgeCount = new HashMap<>();
        int ans = 0;

        for(int[] edge : edges) dsu.union(edge[0], edge[1]);
        for(int[] edge : edges){
            int root = dsu.find(edge[0]);

            edgeCount.put(root, edgeCount.getOrDefault(root, 0) + 1);
        }

        for (int vertex = 0; vertex < n; vertex++){
            if(dsu.find(vertex) == vertex) { 
                int nodeCount = dsu.size[vertex];
                int expectedEdges = (nodeCount * (nodeCount - 1)) / 2;

                if(edgeCount.getOrDefault(vertex, 0) == expectedEdges) ans++;
            }
        }

        return ans;
    }
}
