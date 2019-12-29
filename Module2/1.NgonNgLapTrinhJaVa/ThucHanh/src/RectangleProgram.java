import java.util.Scanner;
public class RectangleProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float width,height;
        System.out.println("Input Width");
        width = sc.nextFloat();
        System.out.println("Input Height");
        height = sc.nextFloat();

        System.out.println("Area Rectangle is: "+(width*height));

    }


}
