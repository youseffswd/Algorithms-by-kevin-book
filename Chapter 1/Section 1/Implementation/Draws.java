import edu.princeton.cs.algs4.StdDraw;

public class Draws {
    public static void main(String[] args) {
        // MY TEST FOR THE API
        // StdDraw.setCanvasSize(700,700);

        // StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        // StdDraw.point(.5,.5);
        // StdDraw.line(.2, .2, .5, .5);
        // StdDraw.circle(.5, .5, .25);
        // StdDraw.setPenColor(StdDraw.BOOK_RED);
        // StdDraw.text(.75, .75, "Hello, World");
        // StdDraw.show();
        // StdDraw.ellipse(.5, .5, .23, .13);
        

        // explaination provided by the website
        // control the size of the point the drawing the line or just a point
        // StdDraw.setPenRadius(0.05);
        // StdDraw.setPenColor(StdDraw.BLUE);
        // StdDraw.point(0.5, 0.5);
        // StdDraw.setPenColor(StdDraw.MAGENTA);
        // StdDraw.line(0.2, 0.2, 0.8, 0.2);
        // StdDraw.setPenRadius();
        // StdDraw.arc(0.5, 0.5, .25, 0, 90);
        
        // Animation
        StdDraw.setScale(-2.0, +2.0);
        StdDraw.enableDoubleBuffering();
        
        for (double t = 0.0; true; t += 0.02) {
            double x = Math.sin(t);
            double y = Math.cos(t);
            System.out.println(x);
            System.out.println(y);
            StdDraw.clear();
            StdDraw.filledCircle(x, y, 0.1);
            StdDraw.circle(0, 0, 1);
            // StdDraw.filledCircle(-x, -y, 0.1);
            StdDraw.show();
            StdDraw.pause(1000);
        }

    }    
}
