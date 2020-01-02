import java.util.Random;
import java.util.Scanner;

public class SumXMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        System.out.print("input length of matrix : ");
        length = sc.nextInt();

        Integer[][] arr = new Integer[length][length];
        Random r = new Random();
        for (int i = 0;i<arr.length;i++){
            for(int j = 0; j< arr[i].length;j++){
                arr[i][j] = r.nextInt(10);
            }
        }

        for (int i = 0;i<arr.length;i++){
            for(int j = 0; j< arr[i].length;j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println("");
        }

        int sum = 0;
        for (int i = 0;i<arr.length;i++){
            sum +=arr[i][i];
        }
        System.out.println("Sum : "+sum);
    }
}
