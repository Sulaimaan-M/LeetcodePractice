package leetcode.problem_1925_square_triples;

public class SquareTriples {

    public int squareTriples(int n){

        int count = 0;

        for(int i = 1; i<=n ; i++){

            for(int j = 1; j<=n; j++){

                double iSqr = Math.pow(i, 2);
                double jSqr = Math.pow(j, 2);
                double cSqr = iSqr+jSqr;
                double c = Math.sqrt(cSqr);
                int cRounded = (int)c;

                if(c-cRounded > 0){

                    continue;

                }

                if(c <= n){

                    count++;

                }

            }

        }

        return count;

    }

}
