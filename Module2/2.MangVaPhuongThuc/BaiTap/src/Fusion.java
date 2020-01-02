import java.util.Random;
import java.util.Scanner;

public class Fusion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar1,ar2;
        System.out.print("input length of array 1 : ");
        ar1 = sc.nextInt();
        System.out.print("input length of array 2 : ");
        ar2 = sc.nextInt();
        Integer[] arr1 = new Integer[ar1];
        Integer[] arr2 = new Integer[ar2];
        Random r = new Random();
        for (int i = 0;i<arr1.length;i++){
                arr1[i] = r.nextInt(100);
        }
        for (int i = 0;i<arr2.length;i++){
            arr2[i] = r.nextInt(100);
        }
        System.out.print("Array 1 : ");
        for (int i = 0;i<arr1.length;i++){
            System.out.print(arr1[i]+ " ");
        }
        System.out.print("\nArray 2 : ");
        for (int i = 0;i<arr2.length;i++){
            System.out.print(arr2[i]+ " ");
        }
        Integer[] arr3 = new Integer[(arr1.length+arr2.length)];
        for(int i =0;i<arr1.length;i++){
            arr3[i] = arr1[i];
        }
        int position = 0;
        for(int i =arr1.length;i<arr3.length;i++){
            arr3[i] = arr2[position];
            position++;
        }

        System.out.print("\nArray 3 : ");
        for (int x:arr3
             ) {
            System.out.print(x + " ");

        }

    }


}
