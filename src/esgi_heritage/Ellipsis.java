package esgi_heritage;

public class Ellipsis extends Shape2D {
    private double rayA;
    private double rayB;

    public Ellipsis(String name, double rayA, double rayB) {
        super(name);
        this.rayA = rayA;
        this.rayB = rayB;
    }

    public double surface() {
        return Math.PI * rayA * rayB;
    }

    public double perimeter() {
        return 2 * Math.PI * Math.sqrt(0.5 * (rayA * rayA + rayB * rayB));
    }

    public double getRayA() {
        return rayA;
    }

    public void setRayA(double rayA) {
        this.rayA = rayA;
    }

    public double getRayB() {
        return rayB;
    }

    public void setRayB(double rayB) {
        this.rayB = rayB;
    }
}