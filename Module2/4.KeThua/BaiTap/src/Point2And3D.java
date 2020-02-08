public class Point2And3D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2And3D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2And3D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public  void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] arr = {this.x,this.y};
        return arr;
    }


    @Override
    public String toString() {
        return "Point2And3D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
