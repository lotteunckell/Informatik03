package lab_04;

public class MountainbikeBuilder extends BikeBuilder {
    @Override
    public AbstractBike buildBike(ITire tire, IFrame frame, IGearShfit gearShift) {
       bike = new Mountainbike(tire, frame, gearShift);
       return bike;
    }

    @Override
    public ITire buildTires(int size, int strength) {
        return new MountainbikeTire(size, strength);
    }

    @Override
    public IFrame buildFrame(int weight, String color) {
        return new MountainbikeFrame(weight, color);
    }

    @Override
    public IGearShfit buildGearShift(int gears) {
        return new MountainbikeGearShift(gears);
    }

    @Override
    public AbstractBike getResult() {
        return bike;
    }
}
