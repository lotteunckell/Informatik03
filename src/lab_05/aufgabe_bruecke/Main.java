package lab_05.aufgabe_bruecke;

public class Main {
    public static void main(String[] args) {
        AbspielDaten daten = new AbspielDaten("Lied1 Lied2 Lied3 Lied4 Lied5");
        System.out.println();
        Abspielgeraet ag = new Abspielgeraet(new CDSpieler());
        ag.anschalten();
        ag.spieleTrackAb(daten, 3);
        ag.ausschalten();
        System.out.println();
        ag = new Abspielgeraet(new KasettenSpieler());
        ag.anschalten();
        ag.spieleTrackAb(daten, 5);
        ag.ausschalten();
        System.out.println();
        Listenabspielgeraet lag = new Listenabspielgeraet(new CDSpieler());
        lag.anschalten();
        lag.shuffleListe(daten);
        lag.ausschalten();
    }
}
