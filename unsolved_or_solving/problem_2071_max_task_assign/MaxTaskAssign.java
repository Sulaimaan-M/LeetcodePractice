package leetcode.unsolved_or_solving.problem_2071_max_task_assign;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxTaskAssign {

    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength){

        Arrays.sort(tasks);
        Arrays.sort(workers);

        ArrayList<Integer> inCompleteTasks = new ArrayList<Integer>();

        int i = tasks.length-1, j = workers.length-1, completed = 0;

        while(i>= 0 && j >= 0){

            int task = tasks[i], worker = workers[j];

            if(worker>=task){

                completed++;
                i--;
                j--;

            }else{

                inCompleteTasks.add(task);
                i--;

            }

        }

        inCompleteTasks.sort(null);
        i = inCompleteTasks.size()-1;

        while(pills > 0 && (i>= 0 && j >= 0)){

            int task = inCompleteTasks.get(i), worker = workers[j];

            if(worker+strength >= task){

                completed++;
                i--;
                j--;
                pills--;

            }else{

                i--;

            }

        }

        return completed;

    }

}
