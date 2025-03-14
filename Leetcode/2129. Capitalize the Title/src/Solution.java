public class Solution {
    public String capitalizeTitle(String title){
        /*
         * Straight Forward Solution 1
         * Time: O(N)
         * Space: O(N)
         */

        StringBuilder sb = new StringBuilder();

        for(String word : title.toLowerCase().split(" ")){
            if(word.length() > 2){
                sb.append(word.toUpperCase().charAt(0));
                sb.append(word.substring(1));
            }else{
                sb.append(word);
            }

            sb.append(" ");
        }

        return sb.toString().trim();
    }
    

    public String capitalizeTitle2(String title){
        /*
         * Straight Forward Solution 2(Faster than 1)
         * Time: O(N)
         * Space: O(N)
         */

        char[] c = title.toCharArray();
        int len = c.length;

        for(int i = 0; i < len; i++){
            int first = i;

            while(i < len && c[i] != ' '){
                c[i] = Character.toLowerCase(c[i]);
                i++;
            }

            if(i - first > 2) c[first] = Character.toUpperCase(c[first]);
        }

        return String.valueOf(c);
    }
}
