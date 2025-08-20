package leetcode.problem_2144_minimum_cost;

import java.util.Arrays;

public class MinimumCost{

    public int minimumCost(int[] cost){

        Arrays.sort(cost);
        int[] arr = cost;
        int len = arr.length, totalCost = 0;
        int i = len-1, a, b;

        while(i>=0){

            if(i==0){

                totalCost+= arr[0];

            }else{

                a = arr[i];
                i--;
                b= arr[i];
                totalCost += a+b;

            }

            i-=2;
    
        }

        return totalCost;

    }

}