package shape;
import java.util.Comparator;
import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

       //CircleComparator circleComparator =  new CircleComparator();
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
//        Arrays.sort(circles);
//        for(int i =0;i<circles.length -1;i++){
//            if(circleComparator.compare(circles[i],circles[i+1])==1){
//                Circle c = new Circle();
//                c= circles[i];
//                circles[i] = circles[i+1];
//                circles[i+1] = c;
//            }
//        }

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
