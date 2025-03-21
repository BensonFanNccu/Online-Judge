import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        /*
         * You have information about n different recipes. 
         * You are given a string array recipes and a 2D string array ingredients. 
         * The ith recipe has the name recipes[i], and you can create it 
         * if you have all the needed ingredients from ingredients[i]. 
         * A recipe can also be an ingredient for other recipes, 
         * i.e., ingredients[i] may contain a string that is in recipes.
         * 
         * You are also given a string array supplies containing all the ingredients 
         * that you initially have, and you have an infinite supply of all of them.
         * 
         * Return a list of all the recipes that you can create. 
         * You may return the answer in any order.
         * 
         * Note that two recipes may contain each other in their ingredients.
         * 
         * Example:
         * Input: recipes = ["bread"], ingredients = [["yeast","flour"]], supplies = ["yeast","flour"]
         * Output: ["bread"]
         */

        Solution sol = new Solution();

        String[] recipes = new String[] {"bread", "sandwich"};
        String[] supplies = new String[] {"yeast", "flour", "meat"};
        List<List<String>> ingredients = Arrays.asList(Arrays.asList("yeast", "flour"), Arrays.asList("bread", "meat"));

        System.out.println(sol.findAllRecipes(recipes, ingredients, supplies));
    }
}
