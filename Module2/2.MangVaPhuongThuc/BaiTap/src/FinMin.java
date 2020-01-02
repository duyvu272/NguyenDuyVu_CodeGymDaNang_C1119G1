import java.util.Random;
import java.util.Scanner;

public class FinMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int number;
        System.out.print("input width of matrix : ");
        number = sc.nextInt();
        Integer[] arr = new Integer[number];
        int min = 0;
        System.out.print("Array 1 : ");
        for(int i =0;i<arr.length;i++){
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + " ");
        }

        min = arr[0];
        for(int i =1;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("\nMin : " + min);

    }
}
