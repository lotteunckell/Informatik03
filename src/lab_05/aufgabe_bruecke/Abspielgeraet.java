package lab_05.aufgabe_bruecke;

public class Abspielgeraet {
    IAbspielgeraetImplementierer abspielgerät;

    public Abspielgeraet(IAbspielgeraetImplementierer abspielgerät) {
        this.abspielgerät = abspielgerät;
    }

    public void anschalten() {
        abspielgerät.anschalten();
    }

    public void spieleAb(AbspielDaten daten) {
        abspielgerät.leseDaten(daten);
        abspielgerät.play();
    }

    public void spieleTrackAb(AbspielDaten daten, int trackNummer) {
        abspielgerät.leseDaten(daten);
        abspielgerät.springeZu(trackNummer);
    }

    public void ausschalten() {
        abspielgerät.ausschalten();
    }
}
