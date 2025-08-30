package leetcode.problem_1299_replace_with_right_highest;

public class ReplaceWithRigthHighest {

    public int[] replaceWithRigthHighest(int[] arr){

        int highest = -1;

        for(int i = arr.length-1; i>=0;i--){

            int temp = arr[i];
            arr[i] = highest;

            highest = Math.max(highest, temp);

        }

        return arr;

    }
    
}