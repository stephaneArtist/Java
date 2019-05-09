package esgi_heritage;

public abstract class Shape3D extends Shape {
    public static int counter = 0;

    Shape3D(String name) {
        super(name);
        counter++;
    }

    protected void finalize() {
        System.out.println("Shape3D.finalize");
        counter--;
        super.finalize();
    }

    public abstract double volume();
}