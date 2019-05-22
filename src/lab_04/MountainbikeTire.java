package lab_04;

public class MountainbikeTire extends AbstractTire {
    public MountainbikeTire(int size, int strength) {
        super(size, strength);
    }

    public String toString(){
        return "Details MountainbikeTire\n        Size: " + this.getSize() + "\n        Strength: " + this.getStrength();
    }
}
