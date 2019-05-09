package esgi_heritage;

public class Villa extends Building {
    private int roomCount;
    private boolean swimmingPool;

    public Villa(int roomCount, boolean swimmingPool, String owner, String address, double surface) {
        super(owner, address, surface);
        this.roomCount =  roomCount;
        this.swimmingPool = swimmingPool;
    }

    public String toString() {
        return "Villa [nbpieces=" + roomCount + ", piscine=" + swimmingPool + ", toString()=" + super.toString() + "]";
    }

    public Villa() {
        super();
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public double tax() {
        return 100 * roomCount + (swimmingPool ? 750 : 0);
    }
}
