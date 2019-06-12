package lab_05.aufgabe_bruecke;

import java.util.ArrayList;
import java.util.Collections;

public class Listenabspielgeraet extends Abspielgeraet {

    public Listenabspielgeraet(IAbspielgeraetImplementierer abspielgerät) {
        super(abspielgerät);
    }

    public void shuffleListe(AbspielDaten daten) {
        abspielgerät.leseDaten(daten);
        int size = abspielgerät.getSize();
        ArrayList<Integer> listOfIndices = new ArrayList<>();
        for (int i = 1; i <= size; i++) listOfIndices.add(i);
        Collections.shuffle(listOfIndices);
        for (int index : listOfIndices) abspielgerät.springeZu(index);
    }
}
