import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;


public class Solution {
    public int countPaths(int n, int[][] roads){
        int mod = 1_000_000_007;
        int[] pathCount = new int[n];
        List<List<int[]>> graph = new ArrayList<>();
        PriorityQueue<long[]> minHeap = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        long[] shortestTime = new long[n];

        Arrays.fill(shortestTime, Long.MAX_VALUE);
        shortestTime[0] = 0; 
        pathCount[0] = 1;
        minHeap.offer(new long[] {0, 0});

        for(int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for(int[] road : roads){
            int startNode = road[0], endNode = road[1], travelTime = road[2];

            graph.get(startNode).add(new int[] {endNode, travelTime});
            graph.get(endNode).add(new int[] {startNode, travelTime});
        }

        while(!minHeap.isEmpty()){
            long[] top = minHeap.poll();
            long currTime = top[0]; 
            int currNode = (int) top[1];

            if(currTime > shortestTime[currNode]) continue;

            for(int[] neighbor : graph.get(currNode)){
                int neighborNode = neighbor[0], roadTime = neighbor[1];

                if(currTime + roadTime < shortestTime[neighborNode]){
                    shortestTime[neighborNode] = currTime + roadTime;
                    pathCount[neighborNode] = pathCount[currNode];
                    minHeap.offer(new long[] {shortestTime[neighborNode], neighborNode});
                }else if(currTime + roadTime == shortestTime[neighborNode]){
                    pathCount[neighborNode] = (pathCount[neighborNode] + pathCount[currNode]) % mod;
                }
            }
        }

        return pathCount[n - 1];
    }
}
