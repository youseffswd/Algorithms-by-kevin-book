

public class Test {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1 ; i < 1000; i *= 2){
            for(int j = 0;  j < 1000;j++){
                sum++;
            }
        }
        System.out.println(sum);
        System.out.println('B' + 'A');
        System.out.println(mystery2(2, 25));
    }
    private static int mystery2(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return mystery2(a * a, b / 2);
        }
        return mystery2(a * a, b / 2) * a;
    }

}
