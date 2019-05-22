package lab_04;

public abstract class AbstractGearShift {
    private int gears;

    public AbstractGearShift(int gears) {
        this.gears = gears;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public abstract String toString();
}
