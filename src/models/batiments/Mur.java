package models.batiments;

import models.Ressources;

public class Mur extends Batiment {
     public Mur(String name, int niveau) {
        super(name, niveau);

    }

    


    public static Batiment construction(Ressources ressources) {
        if (ressources.getWood() < 10) {
            System.err.println("Pas assez de bois");
            return null;
        }
        Mur mur = new Mur("mur", 1); // deplacer dans maison et crée une construction dans batiment et
                                                 // override construction dans toutes les classe
        ressources.addWood(-10);
        return mur;
    }
}
