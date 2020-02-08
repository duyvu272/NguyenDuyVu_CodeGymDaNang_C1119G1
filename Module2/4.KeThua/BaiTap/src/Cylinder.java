public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }
    public double Volume(){
        return this.height*super.Area();

    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "radius="+super.getRadius()+
                "color="+ super.getColor()+
                '}';
    }
}
