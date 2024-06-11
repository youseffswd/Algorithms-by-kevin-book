import edu.princeton.cs.algs4.StdIn;

public class Avergae {
    public static void main(String[] args) {
        double sum = 0.0;
        int count = 0;
        while(!StdIn.isEmpty()){
            sum += StdIn.readDouble();
            count++;
        }
        double avg = sum / count;
        
        System.out.println(avg);
    }
}
