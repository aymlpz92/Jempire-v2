package models.batiments;

import models.Ressources;

public class Atelier extends Batiment {
     public Atelier(String name, int niveau) {
        super(name, niveau);

    }

    public static Batiment construction(Ressources ressources) {
        if (ressources.getWood() < 10) {
            System.err.println("Pas assez de bois");
            return null;
        }
        Atelier atelier = new Atelier("atelier", 1); 
        ressources.addWood(-10);
        return atelier;
    }
}
