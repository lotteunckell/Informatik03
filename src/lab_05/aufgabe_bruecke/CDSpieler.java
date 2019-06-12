package lab_05.aufgabe_bruecke;

import java.util.ArrayList;

public class CDSpieler implements IAbspielgeraetImplementierer {
    private ArrayList<String> daten = new ArrayList<>();
    private int size;

    @Override
    public void leseDaten(AbspielDaten daten) {
        String[] data = daten.toString().split(" ");
        for (String d : data) this.daten.add(d);
        size = data.length;
        System.out.println("Daten vom CD-Player gelesen");
    }

    @Override
    public void springeZu(int trackNummer) {
        System.out.println("Springe zu Track " + (trackNummer == size ? trackNummer : trackNummer%size) + ": " + daten.get((trackNummer-1)%size));
    }

    @Override
    public void play() {
        System.out.println("Spiele Tracks vom CD-Player");
    }

    @Override
    public void anschalten() {
        System.out.println("Hallo vom CD-Player!");
    }

    @Override
    public void ausschalten() {
        System.out.println("Goodbye vom CD-Player!");
    }

    @Override
    public int getSize() {
        return size;
    }
}
