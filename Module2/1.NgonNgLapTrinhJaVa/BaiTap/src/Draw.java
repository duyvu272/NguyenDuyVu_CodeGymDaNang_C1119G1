import java.util.Scanner;

public class Draw {
    public void drawTrigleBottomLeft() {
        for (int i = 6; i > 0; i--) {
            for (int j = i; j < 6; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }

    public void drawTrigleTopLeft() {
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }

    public void drawTrigleTopRight() {
        for (int i = 5; i > 0; i--) {
            for (int j = 5; j > 0; j--) {
                if (j <= i)
                    System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");
            }
            System.out.println("");
        }
    }

    public void drawTrigleBottomRight() {
        for (int i = 6; i > 0; i--) {
            for (int j = 0; j < 6; j++) {
                if (j >= i)
                    System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");
            }
            System.out.println("");
        }
    }

    public void drawRectangle() {
        for (int i = 0; i < 3; i++) {
            System.out.println("* * * * * * *");
        }
    }

    public void drawTrigleIsosceles() {
        for (int i = 6; i > 0; i--) {
            for (int j = 0; j < 6; j++) {
                if (j >= i)
                    System.out.print("*" + " ");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        Draw d = new Draw();
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu" + "\n1.Rectangle" + "\n2.Print the square triangle" + "\n3.Print isosceles triangle" + "\n4.Exit");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    d.drawRectangle();
                    break;
                case 2:
                    d.drawTrigleBottomLeft();
                    System.out.println("");
                    d.drawTrigleTopRight();
                    System.out.println("");
                    d.drawTrigleBottomRight();
                    System.out.println("");
                    d.drawTrigleTopLeft();

                    break;
                case 3:
                    d.drawTrigleIsosceles();
                    break;
                case 4:
                    check = true;
                    break;
                default:
                    System.out.println("number invalid");
            }
        } while (!check);
    }
}
