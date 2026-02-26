package models.batiments;

import models.Ressources;
import models.unites.*;
import java.util.List;

public class Maison extends Batiment {
    private int population;

    public Maison(String name, int niveau) {
        super(name, niveau);

    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }


    public static Batiment construction(Ressources resources) {
        if (resources.getWood() < 20) {
            System.err.println("Pas assez de bois");
            return null;
        }
        Maison maison = new Maison("maison", 1); // deplacer dans maison et crée une construction dans batiment et
                                                 // override construction dans toutes les classe
        resources.addWood(-20);
        return maison;
    }

}
