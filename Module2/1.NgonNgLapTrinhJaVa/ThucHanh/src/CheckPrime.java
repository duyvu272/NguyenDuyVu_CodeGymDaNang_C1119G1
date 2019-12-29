import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input number : ");
        int number = sc.nextInt();
        boolean check = false;
        int i = 2;
        if(number<2){
            System.out.println("Number is not Prime");
        }else
            if(number==2){
                System.out.println("Number is Prime ");
            }else{
                while (i<Math.sqrt(number)){
                    if(number%i==0){
                        check = true;
                        break;
                    }
                    i++;
                }
            }
            if(check){
                System.out.println("Number is not Prime");
            }else
                System.out.println("Number is Prime");

    }
}
