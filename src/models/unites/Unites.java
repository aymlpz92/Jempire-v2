package models.unites;
import models.Village;
import models.batiments.Batiment;

public abstract class Unites {
    protected String name;
    protected int pv;
    protected boolean assigne;
    protected Batiment batimentActuel;

    public Unites(String name, int pv, boolean assigne, Batiment batimentActuel) {
        this.name = name;
        this.pv = pv;
        this.assigne = assigne;
        this.batimentActuel = batimentActuel;
    }

    public abstract void travailler();

}
