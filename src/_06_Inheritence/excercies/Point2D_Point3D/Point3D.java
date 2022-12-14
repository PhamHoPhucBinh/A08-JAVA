package _06_Inheritence.excercies.Point2D_Point3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D(){};
    public Point3D(float z ){
       this.z = z;
    }
    Point3D(float x,float y,float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        super.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
        float []  getXYZ = new  float[3];
        getXYZ[0] = super.getX();
        getXYZ[1] = super.getY();
        getXYZ[2] = this.z;
        return getXYZ;
    }
    public String toString(){
        return " point3d = " + Arrays.toString(getXYZ());
    }
}
