package lab_04;

public class Racer extends AbstractBike {
    @Override
    public String toString() {
        return "Details Racer:\n" + tire + "\n" + frame + "\n" + gearShift;
    }
}
