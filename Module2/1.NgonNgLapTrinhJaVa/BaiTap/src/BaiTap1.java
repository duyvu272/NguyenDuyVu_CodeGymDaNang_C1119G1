import java.util.Scanner;
public class BaiTap1 {
    static int m(int...x) {
        int b = 0;
        for(int a:x){
            b+=a;
        }
        return b;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String st ;
//        System.out.println("input your name : ");
//        st = sc.next();
//        System.out.println("Hello "+st);

        System.out.println(m(1,2,2));
    }
}
