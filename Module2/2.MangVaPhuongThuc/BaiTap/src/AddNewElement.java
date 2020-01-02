import javax.swing.*;
import java.util.Scanner;
public class AddNewElement {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,0,0,0,0};
        Scanner sc = new Scanner(System.in);
        int value , index;
        System.out.println("input index to add : ");
        index = sc.nextInt();
        System.out.println("input value want to add :");
        value = sc.nextInt();
        if(index<0 || index>arr.length-1){
            System.out.println("index invalid");

        }else{
            int temp = arr[index];
            arr[index] = value;
            for(int i = (index+1);i<arr.length;i++){
                int temp2 = arr[i];
                arr[i] = temp;
                temp = temp2;

            }
        }
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
