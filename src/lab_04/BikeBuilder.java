package lab_04;

public abstract class BikeBuilder {
    protected AbstractBike bike;

    public abstract AbstractBike buildBike(ITire tire, IFrame frame, IGearShfit gearShift);

    public abstract ITire buildTires(int size, int strength);

    public abstract IFrame buildFrame(int weight, String color);

    public abstract IGearShfit buildGearShift(int gears);

    public abstract AbstractBike getResult();
}
