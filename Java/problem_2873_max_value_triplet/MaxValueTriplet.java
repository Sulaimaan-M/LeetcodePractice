package leetcode.problem_2873_max_value_triplet;

public class MaxValueTriplet {

    public long maxValueTriplet( int[] nums){

        int numsLength = nums.length;
        int aLimit = numsLength - 3;
        int bLimit = numsLength - 2;
        long highestValue = 0;

        for(int i = 0; i<= aLimit; i++){

            long a = nums[i];

            for(int j = i+1; j<= bLimit; j++){

                long b = nums[j];

                for(int z = j+1; z< numsLength; z++){

                    long c = nums[z];

                    long value = (a-b)*c;

                    highestValue = Math.max(value, highestValue);

                }

            }

        }

        return highestValue;

    }

}
