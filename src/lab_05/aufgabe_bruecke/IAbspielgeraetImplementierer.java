package lab_05.aufgabe_bruecke;

public interface IAbspielgeraetImplementierer {
    void leseDaten(AbspielDaten daten);
    void springeZu(int trackNummer);
    void play();
    void anschalten();
    void ausschalten();
    int getSize();
}
