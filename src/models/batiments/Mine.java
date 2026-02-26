package models.batiments;

import models.Ressources;

public class Mine extends Batiment {

    public Mine(String name, int niveau) {
        super(name, niveau);

    }

    public static Batiment construction(Ressources ressources) {
        if (ressources.getWood() < 20) {
            System.err.println("Pas assez de bois");
            return null;
        }
        Mine mine = new Mine("mine", 1); // deplacer dans maison et crée une construction dans batiment et
                                                 // override construction dans toutes les classe
        ressources.addWood(-20);
        return mine;
    }
}
