import java.util.Scanner;
public class TwentyPrime {
    public boolean isPrime(int number){
        for(int i = 2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwentyPrime iP = new TwentyPrime();
        System.out.println("Input amount prime :");
        int number = sc.nextInt();
        int count = 0;
        int increase = 2;
        while (count<number){
            if (iP.isPrime(increase)){
                System.out.print(increase + " ");
                count++;
            }else
            {
                increase++;
                continue;
            }
            increase++;
        }
    }
}
