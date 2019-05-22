package lab_04;

public class MountainbikeFrame extends AbstractFrame  {
    public MountainbikeFrame(int weight, String color) {
        super(weight, color);
    }

    public String toString() {
        return "Details MpuntainbikeFrame: Weight: " + this.getWeight() + "Color: " + this.getColor();
    }
}
