package lab_04;

public class RacerGearShift extends AbstractGearShift {
    public RacerGearShift(int gears) {
        super(gears);
    }

    public String toString(){
        return "Details RacerGearShift: Number of gears: " + this.getGears();
    }
}
