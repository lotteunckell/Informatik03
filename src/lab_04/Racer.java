package lab_04;

public class Racer extends AbstractBike {

    public Racer(ITire tire, IFrame frame, IGearShfit gearShift) {
        super(tire, frame, gearShift);
    }

    @Override
    public String toString() {
        return "Details Racer:\n     " + tire + "\n     " + frame + "\n     " + gearShift;
    }
}
