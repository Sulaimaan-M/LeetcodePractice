package leetcode.problem_3028_ant_on_boundary;

public class AntOnTheBoundary {

    public int antOnTheBoundary(int[] nums) {

        int steps = 0, visits = 0;

        for (int i = 0; i < nums.length; i++) {

            steps += nums[i];

            if(steps == 0){

                visits++;

            }

        }

        return visits;
    }
}
