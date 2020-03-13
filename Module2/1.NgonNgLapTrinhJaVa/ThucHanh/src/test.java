public class test {


    void method(int x, int y) {
        x = 5;
        y = 5;
    }
    public static void main(String[] args) {
        test o = new test();
        int x = 1, y = 1;
        x= 4; y = 8;
        o.method(x, y);
        System.out.printf("x=%d, y=%d", x, y);
    }
}
