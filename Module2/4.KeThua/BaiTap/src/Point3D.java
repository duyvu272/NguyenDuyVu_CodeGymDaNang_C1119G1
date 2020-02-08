public class Point3D extends Point2And3D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }
    public float[] getXYZ(){
        float[] arr = {this.getX(),this.getY(),this.z};
        return arr;
    }

    @Override
    public String toString() {
        String str = "" ;
        for (float x:this.getXYZ())
            str +="\n"+x;
        return "Point3D{" +
                "xyz=" + str +
                '}';
    }
}
