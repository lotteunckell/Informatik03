package lab_04;

public class MountainbikeGearShift extends AbstractGearShift {
    public MountainbikeGearShift(int gears) {
        super(gears);
    }

    public String toString(){
        return "Details MountainbikeGearShift\n        Number of gears: " + this.getGears();
    }
}