public class ExuteFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setRadius(10);
        fan1.setSpeed(fan1.FAST);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());
    }
}
