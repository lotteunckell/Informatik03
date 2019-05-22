package lab_04;

public abstract class AbstractTire implements ITire{
    private int size;
    private int strength;

    public AbstractTire(int size, int strength) {
        this.size = size;
        this.strength = strength;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

}
