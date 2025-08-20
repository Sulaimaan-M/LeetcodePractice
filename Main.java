package leetcode;

import java.util.Arrays;

import leetcode.unsolved.problem_2966_divide_array.DivideArray;

public class Main {

    public static void main(String[] args) {

        DivideArray obj = new DivideArray();

        // Sample Arguements

        //[1,3,4,8,7,9,3,5,1], 2

        //[2,4,2,2,5,2], 2

        //[4,2,9,8,2,12,7,12,10,5,8,5,5,7,9,2,5,11], 14

        System.out.println(
            Arrays.toString(
                obj.divideArray(

                // Add Test Arguments below
                    new int[]{1,3,4,8,7,9,3,5,1}, 2
                    
                )
            )
        );
       
    }
    
}
