package fans;

public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
    private int speed = SLOW;
    private boolean satus = false;
    private double radius = 5;
    private String color = "BLUE";

    public Fan() {
    }

    public Fan(int speed, boolean satus, double radius, String color) {
        this.speed = speed;
        this.satus = satus;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String isSatus() {
        if (satus){
            return"fan is on";
        }else {
            return "fan is off";
        }
    }

    public void setSatus(boolean satus) {

        this.satus = satus;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "SLOW=" + SLOW +
                ", MEDIUM=" + MEDIUM +
                ", FAST=" + FAST +
                ", speed=" + speed +
                ", satus=" + isSatus() +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
