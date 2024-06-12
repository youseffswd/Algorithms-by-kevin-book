

import java.util.Arrays;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class DrawsExamples {
    public static void main(String[] args) {
        // Functions Representations
        // int N = 100;
        // StdDraw.setXscale(-.1*N,N + .1*N);
        // int Y = N*N;
        // StdDraw.setYscale(-.1*Y,Y + .1*Y);
        // StdDraw.setPenRadius(.01);
        // for(int i = 1; i <= N;i++){
        //     StdDraw.point(i,i);
        //     StdDraw.point(i,i*i);
        //     StdDraw.point(i,i*Math.log(i));
        // }

        // Random
        int N = 100;
        double[] randomsNums = new double[N];
        for(int i = 0 ; i < N;i++){
            randomsNums[i] = N * StdRandom.uniformDouble();
        }

        StdDraw.setScale(-2,N + 2);
        StdDraw.setPenRadius(.005);
        Arrays.sort(randomsNums); // for sorting and can be commented
        StdDraw.enableDoubleBuffering();
        for(double i = 0;i < N;i++ ){
            double x = i;
            double y = randomsNums[(int)i];
            StdDraw.line(x,0,x,y);
            StdDraw.show();
            StdDraw.pause(5);
        }

    }
}
