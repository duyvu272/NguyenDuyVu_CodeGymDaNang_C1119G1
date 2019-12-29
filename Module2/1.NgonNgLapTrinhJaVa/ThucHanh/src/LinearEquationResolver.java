import java.util.Scanner;


public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;

        System.out.println("input a : ");
        a = sc.nextInt();
        System.out.println("input b : ");
        b = sc.nextInt();
        if(a!=0){
            double answer = -b/a;
            System.out.printf("Equation pass with x = %f!\n",answer);
        }else{
            if(b==0){
                System.out.println("all x ");
            }else
                System.out.println("No Solution");
        }


    }


}
