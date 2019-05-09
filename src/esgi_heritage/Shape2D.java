package esgi_heritage;

public abstract class Shape2D extends Shape {
    public static int counter = 0;

    public Shape2D(String nom) {
        super(nom);
        counter++;
    }
    protected void finalize() {
        System.out.println("Forme2D.finalize");
        counter--;
        super.finalize();
    }
    public abstract double perimeter();
}
