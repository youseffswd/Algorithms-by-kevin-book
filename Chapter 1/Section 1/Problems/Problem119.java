
public class Problem119 {
    public static void main(String[] args) {
        int decimal = 10;
        String str = "";
        for(int i = decimal; i > 0;i /= 2){
            str = i % 2 + str;
        }


        System.out.println(str);
    }    
}
