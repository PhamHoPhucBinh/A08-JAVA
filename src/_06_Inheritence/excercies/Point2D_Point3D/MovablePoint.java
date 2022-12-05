package _06_Inheritence.excercies.Point2D_Point3D;

public class MovablePoint extends Point2D {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MovablePoint(){};
    public MovablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(float xSpeed,float ySpeed){
        return new float[]{
                this.getxSpeed(),this.getySpeed()
        };
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "the location of this point is " + super.getX()
                + ","
                + super.getY()
                + "speed = "
                + this.getxSpeed()
                + ","
                + this.getySpeed();
    }
    public MovablePoint move(){
        setX(getX()+getxSpeed());
        setY(getY()+getySpeed());
        return this;
    }
}
