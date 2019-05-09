package esgi_heritage;

public abstract class Shape {
    public static int counter = 0;
    private String name;

    public Shape(String name) {
        counter++;
        this.name = name;
    }

    protected void finalize() {
        System.out.println("Shape.finalize");
        counter--;
    }

    public abstract double surface();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
