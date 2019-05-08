import Fabriken.DidadasFabrik;
import Fabriken.EnkiFabrik;
import Fabriken.Fabrik;
import Fabriken.UmapFabrik;

public class Main {
    static public void main(String[] args) {
        System.out.println("Produziert von Didadas--------------------------------------");
        schuheHerstellen(new DidadasFabrik(), 37, "TollerDidadasSportschuh", 43, "TollerDidadasWanderschuh", 41, "TollerDidadasStiefel");
        System.out.println("Produziert von Enki-----------------------------------------");
        schuheHerstellen(new EnkiFabrik(), 37, "TollerEnkiSportschuh", 43, "TollerEnkiWanderschuh", 41, "TollerEnkiStiefel");
        System.out.println("Produziert von Umap-----------------------------------------");
        schuheHerstellen(new UmapFabrik(), 37, "TollerUmapSportschuh", 43, "TollerUmapWanderschuh", 41, "TollerUmapStiefel");
    }

    static void schuheHerstellen(Fabrik fabrik, int sportSchuhSize, String sportSchuhName, int wanderSchuhSize, String wanderSchuhName, int stiefelSize, String stiefelName) {
        fabrik.getInstance(sportSchuhSize, sportSchuhName, wanderSchuhSize, wanderSchuhName, stiefelSize, stiefelName);
        System.out.println("-------------------------------------------------------------");
    }
}
