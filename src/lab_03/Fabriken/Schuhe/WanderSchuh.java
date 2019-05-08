package lab_03.Fabriken.Schuhe;

public class WanderSchuh extends Schuh {

    public WanderSchuh(int size, String name, String firma) {
        super(size, name, firma, "Wanderschuh");
    }

    public String toString() {
        return typ +" von " + firma + " - Modelname: " + name + ", Größe: " + size;
    }
}
