package lab_03.Fabriken;

import lab_03.Fabriken.Schuhe.SportSchuh;
import lab_03.Fabriken.Schuhe.Stiefel;
import lab_03.Fabriken.Schuhe.WanderSchuh;

public class UmapFabrik implements Fabrik {
    String firma;

    public UmapFabrik() {
        firma = "Umap";
    }

    @Override
    public void getInstance(int sportSchuhSize, String sportSchuhName, int wanderSchuhSize, String wanderSchuhName, int stiefelSize, String stiefelName) {
        SportSchuh sportSchuh = new SportSchuh(sportSchuhSize, sportSchuhName, firma);
        System.out.println(sportSchuh);
        WanderSchuh wanderSchuh = new WanderSchuh(wanderSchuhSize, wanderSchuhName, firma);
        System.out.println(wanderSchuh);
        Stiefel stiefel = new Stiefel(stiefelSize, stiefelName, firma);
        System.out.println(stiefel);
    }
}