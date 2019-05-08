package Fabriken;

import Schuhe.SportSchuh;
import Schuhe.Stiefel;
import Schuhe.WanderSchuh;

public class DidadasFabrik implements Fabrik {
    String firma;

    public DidadasFabrik() {
        firma = "Didadas";
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
