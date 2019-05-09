package esgi_heritage;

public class Company extends Building {
    private String name;
    private int empCount;
    private int avg;

    public Company(String name, int empCount, int avg, String owner, String address, double surface) {
        super(owner, address, surface);
        this.name = name;
        this.empCount = empCount;
        this.avg = avg;
    }

    public Company(String name, int empCount, int avg) {
        this.name = name;
        this.empCount = empCount;
        this.avg = avg;
    }

    public String toString() {
        return "Entreprise [nb_employé=" + empCount + ", moyenne=" + avg + ", nom=" + name + ", toString()=" + super.toString() + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpCount() {
        return empCount;
    }

    public void setEmpCount(int empCount) {
        this.empCount = empCount;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    public double tax() {
        return 6.3 * getSurface();
    }
}
