import java.util.HashSet;
import java.util.Set;


public class Solution {
    @SuppressWarnings("unchecked")
    public boolean isValidSudoku(char[][] board){
        /*
         * HashSet Solution
         * Time: O(1)
         * Space: O(1)
         */
        
        Set<Character>[] row = (Set<Character>[]) new HashSet[9];
        Set<Character>[] col = (Set<Character>[]) new HashSet[9];
        Set<Character>[] box = (Set<Character>[]) new HashSet[9];

        for(int i = 0; i < 9; i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                int idx = (i / 3) * 3 + j / 3;
                char num = board[i][j];

                if(num == '.') continue;
                if(row[i].contains(num)) return false;
                if(col[j].contains(num)) return false;
                if(box[idx].contains(num)) return false;

                row[i].add(num);
                col[j].add(num);
                box[idx].add(num);
            }
        }

        return true;
    }
}
