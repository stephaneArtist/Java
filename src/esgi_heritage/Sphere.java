package esgi_heritage;

public final class Sphere extends Shape3D {
    private double radius = 0.0;
    
    public Sphere(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    
    public double volume() {
        return (4./3.) * Math.PI * radius * radius * radius;
    }
    
    public double surface() {
        return 4 * Math.PI * radius * radius;
    }
}