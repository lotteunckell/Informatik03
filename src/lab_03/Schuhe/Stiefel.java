package lab_03.Schuhe;

public class Stiefel extends Schuh {

    public Stiefel(int size, String name, String firma) {
        super(size, name, firma, "Stiefel");
    }

    public String toString() {
        return typ +" von " + firma + " - Modelname: " + name + ", Größe: " + size;
    }
}
