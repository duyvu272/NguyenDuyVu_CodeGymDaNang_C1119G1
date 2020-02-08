package colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] s = new Shape[5];
        s[0] = new Circle(4);
        s[1] = new Rectangle(4, 6);
        s[2] = new Square(6);
        s[3] = new Square(4, "red", true);
        s[4] = new Circle();
        for (Shape x : s) {
            System.out.println(x);
             if (x instanceof Colorable) {
                ((Square) x).howToColor();
                ((Square) x).howToColor();
            }
        }
    }
}
