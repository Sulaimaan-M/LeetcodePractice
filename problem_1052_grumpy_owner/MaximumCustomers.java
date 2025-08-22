package leetcode.problem_1052_grumpy_owner;

public class MaximumCustomers {

    public int maxSatisfied(int[] customers, int[] grumpy, int minutes){

        int res = 0, total = 0, highSec = 0 ;

        for(int i = 0; i< minutes; i++){

            total += (grumpy[i])*customers[i];

        }

        highSec = total;


        
        for(int i = minutes; i < customers.length; i++){

            //int to = i-minutes;
            total += grumpy[i]*customers[i];
            total -= grumpy[i-minutes]*customers[i-minutes];
            highSec = Math.max(total, highSec);

        }

        for(int i = 0; i< customers.length; i++){

            res += (grumpy[i] == 0? 1 : 0)*customers[i];

        }

        res+=highSec;

        return res;

    }

}
