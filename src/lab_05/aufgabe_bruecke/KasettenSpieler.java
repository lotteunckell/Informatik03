package lab_05.aufgabe_bruecke;

public class KasettenSpieler implements IAbspielgeraetImplementierer {
    private String daten;
    private int size;

    @Override
    public void leseDaten(AbspielDaten daten) {
        this.daten = daten.toString();
        String[] data = daten.toString().split(" ");
        size = data.length;
        System.out.println("Daten vom Kasettenspieler gelesen");
    }

    @Override
    public void springeZu(int trackNummer) {
        String[] data = daten.split(" ");
        System.out.println("Spule zu Track " + (trackNummer == size ? trackNummer : trackNummer%size) + ": " + data[(trackNummer-1)%size]);
    }

    @Override
    public void play() {
        System.out.println("Spiele Tracks vom Kasettenspieler");
    }

    @Override
    public void anschalten() {
        System.out.println("Hallo vom Kasettenspieler!");
    }

    @Override
    public void ausschalten() {
        System.out.println("Goodbye vom Kasettenspieler!");
    }

    @Override
    public int getSize() {
        return size;
    }
}
