import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Integer[] arr = {1, 8, 3, 4, 5, 6, 7, 0, 0, 0, 0};
        Scanner sc = new Scanner(System.in);
        int value;
        for (int x : arr
        ) {
            System.out.print(x + " ");

        }

        System.out.println("\ninput value want to delete :");
        value = sc.nextInt();
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                temp = i;
            }
        }

        for (int i = temp; i < arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
