package models.unites;
import models.Ressources;
import models.batiments.*;





public class Villageois extends Unites {
    private boolean construction = false;


    public Villageois(String name, int pv, boolean assigne, Batiment batimentActuel, boolean construction ) {
        super(name, pv, assigne, batimentActuel);
        this.construction = construction;
    }

    
    public void collecte(Ressources r) {
        if (construction == false  && assigne == false) {
            r.addWood(5);
            r.addFood(3);
        }
    }
    


    @Override
    public void travailler() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'travailler'");
    }

}
