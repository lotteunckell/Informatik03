package lab_04;

public class RacerFrame extends AbstractFrame {
    public RacerFrame(int weight, String color) {
        super(weight, color);
    }

    public String toString() {
        return "Details RacerFrame\n        Weight: " + this.getWeight() + "\n        Color: " + this.getColor();
    }
}
