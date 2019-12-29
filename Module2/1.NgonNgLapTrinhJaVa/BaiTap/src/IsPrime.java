import java.util.Scanner;
public class IsPrime {
    public boolean isPrime(int number){
        for(int i = 2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        IsPrime iP = new IsPrime();
        for (int i = 2;i<100;i++){
            if(iP.isPrime(i)){
                System.out.print(i+" ");
            }
        }

    }
}
