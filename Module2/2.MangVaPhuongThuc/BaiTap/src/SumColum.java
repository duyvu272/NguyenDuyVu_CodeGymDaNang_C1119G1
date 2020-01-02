import java.util.Random;
import java.util.Scanner;

public class SumColum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width,height;
        System.out.print("input width of matrix : ");
        width = sc.nextInt();
        System.out.print("input height of matrix : ");
        height = sc.nextInt();

        Integer[][] arr = new Integer[width][height];
        Random r = new Random();
        for (int i = 0;i<arr.length;i++){
            for(int j = 0; j< arr[i].length;j++){
                arr[i][j] = r.nextInt(10);
            }
        }
        for (int i = 0;i<arr.length;i++){
            for(int j = 0; j< arr[i].length;j++){
                System.out.print(arr[i][j] + "    ");
            }
            System.out.println("");
        }
        System.out.print("\n input column : ");
        int col = sc.nextInt();
        int sum = 0;
        for (int i = 0 ;i<arr.length;i++){
            sum+=arr[i][col];
        }
        System.out.printf("Column %d has sum %d",col,sum);
    }
}
