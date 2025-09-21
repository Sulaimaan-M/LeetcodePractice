package leetcode.problem_905_sort_array_parity;

public class SortArrayParity {

    public int[] sortArrayParity(int[] nums){

        int length = nums.length;
        int[] sorted = new int[length];
        int pointerA = 0, pointerB = length-1;

        for( int i = 0; i< length ; i++){

            int value = nums[i];

            if(value%2 ==0){

                sorted[pointerA] = value;
                pointerA++;

            }else{

                sorted[pointerB] = value;
                pointerB--;

            }

        }

        return sorted;

    }

}
