package esgi_heritage;

public final class Cylinder extends Shape3D {
    private double radius = 0.0;
    private double height = 0.0;
    
    public Cylinder(String name, double radius, double height) {
        super(name);
        this.radius = radius;
        this.height = height;
    }
    
    public double volume() {
        return Math.PI * radius * radius * height;
    }
    
    public double surface() {
        return (height + 2) * (2 * Math.PI * radius);
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setheight(double h) {
        this.height = h;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double r) {
        this.radius = r;
    }
}