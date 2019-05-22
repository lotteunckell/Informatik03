package lab_04;

public class RacerBuilder extends BikeBuilder {

    @Override
    public AbstractBike buildBike(ITire tire, IFrame frame, IGearShfit gearShift) {
       bike = new Racer(tire, frame, gearShift);
       return bike;
    }

    @Override
    public ITire buildTires(int size, int strength) {
        return new RacerTire(size, strength);
    }

    @Override
    public IFrame buildFrame(int weight, String color) {
        return new RacerFrame(weight, color);
    }

    @Override
    public IGearShfit buildGearShift(int gears) {
        return new RacerGearShift(gears);
    }

    @Override
    public AbstractBike getResult() {
        return bike;
    }
}
