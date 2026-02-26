package models.batiments;

import models.Ressources;
import models.unites.*;
import java.util.List;

public class Maison extends Batiment {
  

    public Maison(String name, int niveau) {
        super(name, niveau);

    }

    


    public static Batiment construction(Ressources ressources) {
        if (ressources.getWood() < 10) {
            System.err.println("Pas assez de bois");
            return null;
        }
        Maison maison = new Maison("maison", 1); // deplacer dans maison et crée une construction dans batiment et
                                                 // override construction dans toutes les classe
        ressources.addWood(-10);
        return maison;
    }

}
