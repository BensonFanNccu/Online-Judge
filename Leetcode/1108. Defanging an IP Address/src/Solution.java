public class Solution {
    public String defangIPaddr(String address){
        /*
         * Straight Forward Solution
         * Time: O(N)
         * Space: O(N)
         */

        StringBuilder sb = new StringBuilder();

        for(char c : address.toCharArray()){
            if(c == '.') sb.append("[.]");
            else sb.append(c);
        }

        return sb.toString();
    }


    public String defangIPaddr2(String address){
        /*
         * Built-in Solution
         * Time: O(N)
         * Space: O(N)
         */
        
        return address.replace(".", "[.]");
    }
}
