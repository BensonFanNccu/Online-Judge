import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;


public class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies){
        /*
         * Topological Sort Solution
         * Time: O(V+E)
         * Space: O(V+E)
         */

        Set<String> available = new HashSet<>();
        List<String> ans = new ArrayList<>();
        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Integer> recipeMap = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        int[] order = new int[recipes.length];

        for(String supply: supplies) available.add(supply);
        for(int i = 0; i < recipes.length; i++) recipeMap.put(recipes[i], i);
        for(int i = 0; i < recipes.length; i++){
            for(String ingredient: ingredients.get(i)){
                if(!available.contains(ingredient)){
                    graph.putIfAbsent(ingredient, new ArrayList<String>());
                    graph.get(ingredient).add(recipes[i]);
                    order[i]++;
                }
            }
        }

        for(int i = 0; i < recipes.length; i++){
            if(order[i] == 0) queue.add(i);
        }

        while(!queue.isEmpty()){
            String recipe = recipes[queue.poll()];

            ans.add(recipe);

            if(!graph.containsKey(recipe)) continue;

            for(String dependentRecipe : graph.get(recipe)){
                if(--order[recipeMap.get(dependentRecipe)] == 0){
                    queue.add(recipeMap.get(dependentRecipe));
                }
            }
        }

        return ans;
    }
}
