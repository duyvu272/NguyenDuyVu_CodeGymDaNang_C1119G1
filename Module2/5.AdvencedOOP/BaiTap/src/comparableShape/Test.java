package comparableShape;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        ComparableCircle[] circles = new ComparableCircle[3];
//        circles[0] = new ComparableCircle(3.6);
//        circles[1] = new ComparableCircle();
//        circles[2] = new ComparableCircle(3.5, "indigo", false);
        ComparableRectangle[] rectangles = new ComparableRectangle[3];
        rectangles[0] = new ComparableRectangle(4,5);
        rectangles[1] = new ComparableRectangle();
        rectangles[2] = new ComparableRectangle(7,8,"red",true);

        System.out.println("Pre-sorted:");
        for (ComparableRectangle r : rectangles) {
            System.out.println(rectangles);
        }

        Arrays.sort(rectangles);

        System.out.println("After-sorted:");
        for (ComparableRectangle x : rectangles) {
            System.out.println(x);
        }
    }
}
