package lab_04;

public abstract class AbstractBike {
    protected ITire tire;
    protected IFrame frame;
    protected IGearShfit gearShift;

    public abstract String toString();

    public AbstractBike(ITire tire, IFrame frame, IGearShfit gearShift){
        this.tire = tire;
        this.frame = frame;
        this.gearShift = gearShift;
    }
}
