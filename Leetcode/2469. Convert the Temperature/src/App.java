public class App {
    public static void main(String[] args) throws Exception {
        /*
         * You are given a non-negative floating point number rounded to two decimal places celsius, 
         * that denotes the temperature in Celsius.
         * You should convert Celsius into Kelvin and Fahrenheit and return it as 
         * an array ans = [kelvin, fahrenheit].
         * 
         * Return the array ans. Answers within 10^-5 of the actual answer will be accepted.
         * 
         * Note that:
         * 1. Kelvin = Celsius + 273.15
         * 2. Fahrenheit = Celsius * 1.80 + 32.00
         */
        
        Solution sol = new Solution();

        double case1 = 36.5;
        double case2 = 122.11;

        System.out.println(sol.convertTemperature(case1));
        System.out.println(sol.convertTemperature(case2));
    }
}
