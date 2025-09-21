package leetcode.problem_2966_divide_array;

import java.util.Arrays;

public class DivideArray {

    public int[][] divideArray(int[] nums, int k){

        int n = nums.length;
        int[][] result = new int[n/3][3];
        Arrays.sort(nums);

        for(int i = 0; i < n; i += 3){
            // Check if the difference between max and min in this group is <= k
            if(nums[i+2] - nums[i] > k){
                return new int[0][];
            }
            result[i/3][0] = nums[i];
            result[i/3][1] = nums[i+1];
            result[i/3][2] = nums[i+2];
        }

        return result;
    }
    
}
