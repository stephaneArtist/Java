package esgi_heritage;

abstract public class Building implements Comparable<Building> {
    private String owner;
    private String address;
    private double surface;

    abstract public double tax();

    public Building() { }

    public Building(String owner, String address, double surface) {
        this.owner = owner;
        this.address = address;
        this.surface = surface;
    }

    public String toString() {
        return "Nom : " + owner + ", adresse : " + address + ", surface : " + surface;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public void print() {
        System.out.println("Nom : " + owner + ", adresse : " + address + ", surface : " + surface);
    }

    public int compareTo(Building b) {
        if (surface < b.surface)
            return -1;
        else if (surface > b.surface)
            return 1;
        else
            return 0;
    }
}
