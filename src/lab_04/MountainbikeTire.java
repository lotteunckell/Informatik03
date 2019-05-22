package lab_04;

public class MountainbikeTire extends AbstractTire {
    public MountainbikeTire(int size, int strength) {
        super(size, strength);
    }

    public String toString(){
        return "Details MountainbikeTire: Size: " + this.getSize() + " Strength: " + this.getStrength();
    }
}
