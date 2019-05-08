package lab_03.Schuhe;

public abstract class Schuh {
    int size;
    String name;
    String firma;
    String typ;

    public Schuh(int size, String name, String firma, String typ) {
        this.size = size;
        this.name = name;
        this.firma = firma;
        this.typ = typ;
    }

    abstract public String toString();
}
