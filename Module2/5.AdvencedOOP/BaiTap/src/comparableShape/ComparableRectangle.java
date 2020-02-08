package comparableShape;

import shape.Rectangle;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {
    public ComparableRectangle() {
    }

    public ComparableRectangle(double width, double length) {
        super(width, length);
    }

    public ComparableRectangle(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }

    @Override
    public int compareTo(ComparableRectangle comparableRectangle) {
        if (getArea() > comparableRectangle.getArea()) return 1;
        else if (getArea() < comparableRectangle.getArea()) return -1;
        else return 1;
    }
}
