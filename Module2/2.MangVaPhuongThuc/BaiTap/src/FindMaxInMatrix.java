import java.util.Random;
import java.util.Scanner;

public class FindMaxInMatrix {

    public static void findMsx(Integer[][] arr){
        int max = 0,positionX=0,positionY=0;

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                    positionX = i;
                    positionY = j;
                }
            }
        }
        System.out.printf("%d is the biggest in array and position arr[%d][%d] ",max,positionX,positionY);
    }

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
                arr[i][j] = r.nextInt(100);
            }
        }

        for (int i = 0;i<arr.length;i++){
            for(int j = 0; j< arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        findMsx(arr);

    }
}
