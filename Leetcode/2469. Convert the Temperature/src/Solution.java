public class Solution {
    public double[] convertTemperature(double celsius){
        /*
         * Straight Forward Solution
         * Time: O(1)
         * Space: O(1)
         */
        
        return new double[] {celsius + 273.15, celsius * 1.8 + 32};
    }
}
