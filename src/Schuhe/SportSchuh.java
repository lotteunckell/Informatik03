package Schuhe;

public class SportSchuh extends Schuh {

    public SportSchuh(int size, String name, String firma) {
        super(size, name, firma, "Sportschuh");
    }

    public String toString() {
        return typ +" von " + firma + " - Modelname: " + name + ", Größe: " + size;
    }
}
