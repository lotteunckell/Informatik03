package lab_04;

public class Mountainbike extends AbstractBike {
    @Override
    public String toString() {
        return "Details Mountainbike:\n" + tire + "\n" + frame + "\n" + gearShift;
    }
}
