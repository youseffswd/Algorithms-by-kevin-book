import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

class Test{
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double low = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);
        for(int i = 0; i < N;i++){
            double val = StdRandom.uniformDouble(low, hi);
            StdOut.printf("%.2f\n",val);
        }
        StdOut.printf("%-10s","asdfadfasffffff");

    }
}