import Fabriken.DidadasFabrik;
import Fabriken.EnkiFabrik;
import Fabriken.UmapFabrik;

public class Main {
    static public void main(String[] args) {
        System.out.println("Produziert von Didadas--------------------------------------");
        DidadasFabrik didadasFabrik = new DidadasFabrik();
        didadasFabrik.getInstance(37, "TollerDidadasSportschuh", 43, "TollerDidadasWanderschuh", 41, "TollerDidadasStiefel");
        System.out.println("------------------------------------------------------------");
        System.out.println("Produziert von Enki-----------------------------------------");
        EnkiFabrik enkiFabrik = new EnkiFabrik();
        enkiFabrik.getInstance(37, "TollerEnkiSportschuh", 43, "TollerEnkiWanderschuh", 41, "TollerEnkiStiefel");
        System.out.println("------------------------------------------------------------");
        System.out.println("Produziert von Umap-----------------------------------------");
        UmapFabrik umapFabrik = new UmapFabrik();
        umapFabrik.getInstance(37, "TollerUmapSportschuh", 43, "TollerUmapWanderschuh", 41, "TollerUmapStiefel");
        System.out.println("------------------------------------------------------------");
    }
}
