import java.util.Scanner;

public class ExcuteQuadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a");
        double a = sc.nextDouble();
        System.out.println("input b");
        double b = sc.nextDouble();
        System.out.println("input c");
        double c = sc.nextDouble();
        QuadraticEquation q = new QuadraticEquation(a,b,c);
        if(q.getDiscriminant()>0){
            System.out.printf("the equation has two root : %f and : %f",q.getRoot1(),q.getRoot2());
        }else if(q.getDiscriminant()==0){
            System.out.println("the equation has one root : "+q.getRoot1());
        }else
            System.out.println("The equation has no roots");
    }

}
