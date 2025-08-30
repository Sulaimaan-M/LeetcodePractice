package leetcode;

import java.lang.foreign.ValueLayout;
import java.util.Arrays;
import java.util.stream.Stream;

import leetcode.problem_1299_replace_with_right_highest.ReplaceWithRigthHighest;
import leetcode.unsolved_or_solving.problem_36_validate_sodoku.ValidateSodoku;

public class Main {

    public static void main(String[] args) {

        // Sample Arguments

        /*
         * 
         * {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}}
         * 
         */

         ValidateSodoku obj = new ValidateSodoku();

         System.out.println(

            obj.validateSodoku(new char[][]{
                {'5','3','.','.','7','.','.','.','.'},//0
                {'6','.','.','1','9','5','.','.','.'},//1
                {'.','9','8','.','.','.','.','6','.'},//2
                {'8','.','.','.','6','.','.','.','3'},//3
                {'4','.','.','8','.','3','.','.','1'},//4
                {'7','.','.','.','2','.','.','.','6'},//5
                {'.','6','.','.','.','.','2','8','.'},//6
                {'.','.','.','4','1','9','.','.','5'},//7
                {'.','.','.','.','8','.','.','7','9'}//8
            })

         );
       
    }
    
}
