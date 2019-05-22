package lab_04;

public class RacerBuilder extends BikeBuilder {
    @Override
    public AbstractBike buildBike() {
        return new Racer();
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
}
