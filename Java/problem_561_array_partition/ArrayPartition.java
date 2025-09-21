package leetcode.problem_561_array_partition;

import java.util.Arrays;

public class ArrayPartition {

    public int arrayPartition(int[] nums){

        int sum =0;

        Arrays.sort(nums);

        for(int i = nums.length-1; i>= 0;i--){

            i--;

            sum += nums[i];

        }

        return sum;

    }

}
