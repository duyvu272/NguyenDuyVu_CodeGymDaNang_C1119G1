import java.util.Scanner;
public class UsdToVND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rate = 23000;
        System.out.println("Input amount usd to transfer : ");
        double money = sc.nextDouble();
        double vnd = money*rate;
        System.out.printf("%1.1f USD = %1.1f VND",money,vnd);
    }
}
