import java.util.Scanner;

public class TriangleException {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a");
        int c = sc.nextInt();
        System.out.println("input b");
        int b = sc.nextInt();
        System.out.println("input c");
        int a = sc.nextInt();
        try {
            CheckSumSide.checkSide(c,b,a);
            System.out.println("Hello triangle");
        }catch (SideNegative e){
            System.err.println(e.getMessage());
        }catch (SumSide e){
            System.err.print(e.getMessage());
        }
    }


}
