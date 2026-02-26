package models.unites;

import models.batiments.Batiment;

public class Eclaireurs extends Soldat {

    public Eclaireurs(String name, int pv, boolean assigne, Batiment batimentActuel) {
        super(name, pv, assigne, batimentActuel);
    }
    
}
