


public class TasksPage21 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(findMaxValue(numbers));
        System.out.println(avg(numbers));
        int[] copiedNumbers = copy(numbers);
        copiedNumbers[1] = 1000;
        System.out.println(numbers[1]);
        System.out.println(copiedNumbers[1]); // not equal :)
        reverse(copiedNumbers);
        System.out.println(copiedNumbers[0]); // 10 reversed
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{1, 0}, {2, 1}};
        int N = 2;
        int[][] result = matrixMultiplication(A, B, N);
        printMatrix(result);
    }
    public static int findMaxValue(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
    public static double avg(int[] arr){
        double sum = 0;
        for(int i = 0; i < arr.length;i++){
            sum += arr[i];
        }
        return  sum / arr.length;
    }
    public static int[] copy(int[] arr){
        int[] copy = new int[arr.length];
        for(int i = 0; i < arr.length;i++){
            copy[i] = arr[i];
        }
        return copy;
    }
    public static void reverse(int[] arr){
        for(int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
    public static int[][] matrixMultiplication(int[][] A,int[][] B,int N){
        int[][] C = new int[N][N];
        for(int i = 0; i < N;i++){
            for(int j = 0; j < N; j++){

                for(int k = 0; k < N;k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }
    public static void printMatrix(int[][] arr){
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr.length;j++) System.out.print(arr[i][j] + "  ");
            System.err.println();
        }
    }
    
}
