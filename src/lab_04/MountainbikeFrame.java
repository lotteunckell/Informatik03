package lab_04;

public class MountainbikeFrame extends AbstractFrame  {
    public MountainbikeFrame(int weight, String color) {
        super(weight, color);
    }

    public String toString() {
        return "Details MountainbikeFrame\n        Weight: " + this.getWeight() + "\n        Color: " + this.getColor();
    }
}
