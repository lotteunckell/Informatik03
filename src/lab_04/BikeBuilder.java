package lab_04;

public abstract class BikeBuilder {

    public abstract AbstractBike buildBike();

    public abstract ITire buildTires(int size, int strength);

    public abstract IFrame buildFrame(int weight, String color);

    public abstract IGearShfit buildGearShift(int gears);
}
