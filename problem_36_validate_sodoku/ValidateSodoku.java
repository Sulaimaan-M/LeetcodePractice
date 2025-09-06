package leetcode.problem_36_validate_sodoku;

import java.util.HashSet;

public class ValidateSodoku {

    public boolean validateSodoku(char [][] board){

        HashSet<Character> extractSet = new HashSet<>();

        for(int i = 0; i<9;i++){

            for(int j = 0; j< 9;j++){

                char element= board[i][j];

                if(element == '.')
                    continue;
                else if(extractSet.contains(element))
                    return false;
                else
                    extractSet.add(element);

            }

            extractSet = new HashSet<>();

        }

        for(int i = 0; i<9;i++){

            for(int j = 0; j< 9;j++){

                char element= board[j][i];

                if(element == '.')
                    continue;
                else if(extractSet.contains(element))
                    return false;
                else
                    extractSet.add(element);

            }

            extractSet = new HashSet<>();

        }

        // Check 3x3 subgrids
        for (int blockRow = 0; blockRow < 3; blockRow++) {
            for (int blockCol = 0; blockCol < 3; blockCol++) {
                HashSet<Character> subgridSet = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char element = board[blockRow * 3 + i][blockCol * 3 + j];
                        if (element == '.') continue;
                        if (subgridSet.contains(element)) return false;
                        subgridSet.add(element);
                    }
                }
            }
        }

        
        return true;

    }
    
}
