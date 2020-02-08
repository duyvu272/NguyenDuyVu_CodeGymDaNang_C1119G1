package shape;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Shape[] s = new Shape[2];
        Random r = new Random();
        s[0] = new Circle(4);
        s[1] = new Rectangle(3,5);
        for(int i = 0;i<s.length;i++) {
            s[i].resize(r.nextDouble());
        }


    }
}
