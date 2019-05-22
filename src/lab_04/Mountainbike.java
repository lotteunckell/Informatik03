package lab_04;

public class Mountainbike extends AbstractBike {

    public Mountainbike(ITire tire, IFrame frame, IGearShfit gearShift) {
        super(tire, frame, gearShift);
    }

    @Override
    public String toString() {
        return "Details Mountainbike:\n     " + tire + "\n     " + frame + "\n     " + gearShift;
    }
}
