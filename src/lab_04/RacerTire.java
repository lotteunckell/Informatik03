package lab_04;

public class RacerTire extends AbstractTire {
    public RacerTire(int size, int strength) {
        super(size, strength);
    }

    public String toString(){
        return "Details RacerTire\n        Size: " + this.getSize() + "\n        Strength: " + this.getStrength();
    }
}
