package models;

import models.batiments.Batiment;
import models.batiments.Maison;
import models.unites.Unites;
import models.unites.Villageois;
import java.util.ArrayList;
import java.util.List;

public class Village {
    List<Unites> population = new ArrayList<>();
    List<Batiment> batiments = new ArrayList<>();
    Ressources ressources;

    public Village(List<Unites> population, List<Batiment> batiments, Ressources ressources) {
        this.population = population;
        this.batiments = batiments;
        this.ressources = ressources;
    }

    public void displayRessources() {
        displayPopulation();
        System.out.print("\n| Bois : " + ressources.getWood());
        System.out.print(" || Pierre : " + ressources.getStone());
        System.out.print(" || Fer : " + ressources.getIron());
        System.out.print(" || Or : " + ressources.getGold());
        System.out.println(" || Nourriture : " + ressources.getFood());
    }

    public void displayPopulation() {
        for (Unites nom : population) {
            System.out.println(nom);
        }
    }

    public void displayBatiments() {

    }

    public void nextDay() {
        // Boucler sur poupulation, appeler travailler() et décrémenté food
    }

    public void afficherDetails() {
        for (Batiment batiment : batiments) {
            System.out.println(batiment.getName());
        }
    }

    public boolean isGameOver() {
        return false;
    }

    public Ressources getRessources() {
        return ressources;
    }

    public Unites ajouterUnite() {
        Villageois villageois = new Villageois("Paul", 10, false, null, false);
        population.add(villageois);
        return villageois;
    }

    public Batiment ajouterBatiment(Batiment batiment) {
        batiments.add(batiment);
        return batiment;
    }

}
