
public class Problem113 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        if(x == y && y == z){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }    
}
